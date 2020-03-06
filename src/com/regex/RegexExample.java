package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexExample

{
 public static void main(String[] args)
 {
  Pattern pattern = Pattern.compile("Ram|Laxman");
  Matcher matcher = pattern.matcher("Generally, Ram and Laxtmant share a great bonding.");
   
  while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(" - " + matcher.group());
        }
 }
}