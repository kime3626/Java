package week02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Readingandvideooutline {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> bikes = new ArrayList<String>();
		
		bikes.add("Ducati Streetfighter V4");
        bikes.add("Kawasaki Ninja ZX-10r");
        bikes.add("Kawasaki Ninja H2r");
        bikes.add("Royal Enfield Continental GT");
       
        boolean isKawasakiPresent = bikes.contains("Kawasaki");

        // Print the result
        System.out.println("Is 'Kawasaki' present in the list? " + isKawasakiPresent);

        // Check if "Grapes" exists in the ArrayList
        boolean isHeroHondaPresent = bikes.contains("Hero Honda");

        // Print the result
        System.out.println("Is 'Hero Honda' present in the list? " + isHeroHondaPresent);
		
	
       
        
        
	}
}
