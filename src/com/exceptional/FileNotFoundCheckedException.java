package com.exceptional;
import java.io.*; 

class FileNotFoundCheckedException { 
	public static void main(String[] args) throws Exception { 
		FileReader file = null;
		try {
			file = new FileReader("empty");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		BufferedReader fileInput = new BufferedReader(file); 
		
		// Print first 3 lines of file "C:\test\a.txt" 
		for (int counter = 0; counter < 3; counter++)
			try {
				System.out.println(fileInput.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		fileInput.close(); 
	} 
} 
