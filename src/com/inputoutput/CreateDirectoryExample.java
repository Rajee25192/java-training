package com.inputoutput;
import java.io.File;

public class CreateDirectoryExample {

    public static void main(String[] args) {

        File file = new File("/Users/rajekuma/Documents/Directory1");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }

        File files = new File("/Users/rajekuma/Sub2/Sub-Sub2");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }

    }

}