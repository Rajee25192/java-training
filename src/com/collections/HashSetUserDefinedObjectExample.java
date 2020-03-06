package com.collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Customer1 {
    private long id;
    private String name;

    public Customer1(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Two customers are equal if their IDs are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer1 customer = (Customer1) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashSetUserDefinedObjectExample {
    public static void main(String[] args) {
        Set<Customer1> customers = new HashSet<>();
        customers.add(new Customer1(101, "Rajeev"));
        customers.add(new Customer1(102, "Sachin"));
        customers.add(new Customer1(103, "Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations 
          of the Customer class to check for duplicates and ignore them
        */
        customers.add(new Customer1(101, "Rajeev"));

        System.out.println(customers);
    }
}