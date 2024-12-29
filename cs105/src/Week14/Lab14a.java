/**
* File: Lab14a.java
* Description: This program stores General Authorities and their Callings in a HashMap.
* Lessons Learned:
*     1. HashMap
*
* Instructor's Name: Jeffrey Light
*
* @author: Kimball Bushi
* @since: 9 April 2024
*/

package Week14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Lab14a {

	public static void main(String[] args) {
		
		Scanner in =  new Scanner (System.in);
		        
		HashMap<String, String> authorities = new HashMap<String,String>();
		
		authorities.put("Russell M Nelson","Prophet");
		authorities.put("Carl B Cook","Seventy");
		authorities.put("Jeffrey R Holland","Apostle");
		authorities.put("Dieter F Uchtdorf","Apostle");
		authorities.put("Patrick Kearon","Apostle");
		authorities.put("Ulisses Soares","Apostle");
		authorities.put("Gerald Causse","Presiding Bishop");
		
		ArrayList <String> authoritiesList = new ArrayList <String>(authorities.keySet()); 
		
		Collections.sort(authoritiesList);
		
		for(String key :   authoritiesList) { 
			
			System.out.printf("%s has the calling of %s%n",key, authorities.get(key));
			
		} // End of For loop
		
		in.close();//closing the scanner
		
	}// End of Main
} // End of class
