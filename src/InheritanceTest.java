//Java program to illustrate the 
// concept of inheritance 

// base class 
class Bicycle 
{ 
	// the Bicycle class has two fields 
	public int gear; 
	public int speed; 
		
	// the Bicycle class has one constructor 
	public Bicycle(int gear, int speed) 
	{ 
		this.gear = gear; 
		this.speed = speed; 
	} 
		
	public Bicycle() {
		// TODO Auto-generated constructor stub
	}

	// the Bicycle class has three methods 
	public void applyBrake(int decrement) 
	{ 
		speed -= decrement; 
	} 
		
	public void speedUp(int increment) 
	{ 
		speed += increment; 
	} 
	
	// toString() method to print info of Bicycle 
	public String toString() 
	{ 
		System.out.println(gear);
		return("No of gears are :"+gear 
				+"\n"
				+ "speed of bicycle is "+speed); 
	} 
} 

// derived class 
class MountainBike extends Bicycle 
{ 
	public MountainBike(){
		super();
	}
	
	// the MountainBike subclass adds one more field 
	public int seatHeight; 

	// the MountainBike subclass has one constructor 
	public MountainBike(int gear,int speed, 
						int startHeight) 
	{ 
		// invoking base-class(Bicycle) constructor 
		super(gear,speed); 
		seatHeight = startHeight; 
	} 
		
	// the MountainBike subclass adds one more method 
	public void setHeight(int seatHeight) 
	{ 
		this.seatHeight = seatHeight; 
	} 
	
	// overriding toString() method 
	// of Bicycle to print more info 
	@Override
	public String toString() 
	{ 
		return (super.toString()+ 
				"\nseat height is "+seatHeight); 
	} 
	
} 

// driver class 
public class InheritanceTest 
{ 
	public static void main(String args[]) 
	{ 
		
		MountainBike mb = new MountainBike(2, 10, 25); 
		
		System.out.println(mb.toString()); 
			
	} 
} 
