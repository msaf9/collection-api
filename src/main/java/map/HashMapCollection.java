package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		// Creating a HashMap
        Map<String, Integer> personAgeMap = new HashMap<>();
        
//        Adding key-value pairs
        personAgeMap.put("Alice", 30);
        personAgeMap.put("Bob", 25);
        personAgeMap.put("Charlie", 35);
        
//        Iterating over the map
        System.out.println("Iterating over the map:");
        for(Map.Entry<String, Integer> entry : personAgeMap.entrySet()) {
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
//        Retrieving a value using a key
        System.out.println("\nRetrieving a value using a key");
        int getBobAge = personAgeMap.get("Bob");
        System.out.println("Bob's age is " + getBobAge + ".");
        
//        Removing a key-value pair
        System.out.println("\nIterating over the map after removing a key-value pair - Alice:");
        personAgeMap.remove("Alice");
        for(Map.Entry<String, Integer> entry : personAgeMap.entrySet()) {
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
//        Checking if a key exists
        System.out.println("\nChecking if a key exists:");
        if(personAgeMap.containsKey("Charlie")) {
        	System.out.println("Charlie is in the map.");
        }
        
        /*
        
        Iterating over the map:
        Bob:25
        Alice:30
        Charlie:35

        Retrieving a value using a key:
        Bob's age is 25.

        Iterating over the map after removing a key-value pair - Alice:
        Bob:25
        Charlie:35

        Checking if a key exists:
        Charlie is in the map.
        
        */
        	
	}

}
