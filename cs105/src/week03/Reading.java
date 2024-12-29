package week03;

import java.io.PrintWriter;

public class Reading {

	

		      public static void main(String[] args) throws Exception {
		    	  
		    	        // Create a PrintWriter object for writing to the console
		    	        PrintWriter consoleWriter = new PrintWriter(System.out);
		    	        
		    	        // Write a string to the console
		    	        consoleWriter.println("Hello, world!");
		    	        
		    	        // Flush and close the PrintWriter for the console
		    	        consoleWriter.flush();
		    	        consoleWriter.close();
		    	        
		    	        // Create a PrintWriter object for writing to a file
		    	        try {
		    	            PrintWriter fileWriter = new PrintWriter("output.txt");
		    	            
		    	            // Write a string to the file
		    	            fileWriter.println("Java is awesome!");
		    	            
		    	            // Flush and close the PrintWriter for the file
		    	            fileWriter.flush();
		    	            fileWriter.close();
		    	        } catch (Exception e) {
		    	            System.out.println("Error: " + e.getMessage());
		    	        }
		    	    }
		    	}