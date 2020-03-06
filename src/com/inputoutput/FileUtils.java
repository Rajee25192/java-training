package com.inputoutput;
import java.io.File;
import java.text.DecimalFormat;


public class FileUtils {
 
    public static String readableFileSize(long size) {
        if (size <= 0) {
            return "0";
        }
        final String[] units = new String[] {"B", "KB", "MB", "GB", "TB"};
        int digitGroups = (int)(Math.log10(size) / Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) 
          + " " + units[digitGroups];
    }
    
    public static void main(String[] args) {
     File file = new File("sample.txt");
     String size = readableFileSize(file.length());
     System.out.println(size);
    }
}