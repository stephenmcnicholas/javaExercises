package collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

	
	public static String[] vehicles = {"helicopter", "ambulance", "lifeboat"}; // an array of vehicles
	public static String[][] drivers = { // a multi dim array of drivers authorised to drive those vehicles (in order)
			{"Rita", "Sue", "Bob"}, // helicopter pilots
			{"Sue", "Bob", "Pete", "Freddie"}, // ambulance drivers
			{"Bob", "Rob", "Tim"}, // lifeboat pilots
	};
	

	
	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>(); // create HashMap to store vehicle as a string, and a Set of drivers assoc
		
		for(int i = 0; i < vehicles.length; i++) { // loop through vehicles list
			String vehicle = vehicles[i]; 
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for(String driver: driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}
		
		for (String vehicle: personnel.keySet()) {
			System.out.print(vehicle + ": ");
			Set<String> driversList = personnel.get(vehicle);
			for(String driver : driversList) {
				System.out.print(driver + " ");
			}
			System.out.println();
			
		}
	}

}
