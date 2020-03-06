package com.regex;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexExample {

    public static void main(String[] args) {

        List < String > words = Arrays.asList("One", "Two",
            "Three", "Four", "Five", "Six", "Seven", "Maven", "Amen", "eleven");

        Pattern p = Pattern.compile("..even");

        for (String word: words) {

            Matcher m = p.matcher(word);

            if (m.matches()) {
                System.out.printf("%s -> matches%n", word);
            } else {
                System.out.printf("%s -> does not match%n", word);
            }
        }
    }
}