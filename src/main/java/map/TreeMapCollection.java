package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
//		Creating a TreeMap
		Map<String, String> treeMap = new TreeMap<>();
		
//      Adding key-value pairs
		treeMap.put("BER", "BERKELEY");
		treeMap.put("ALB", "ALBANY");
		treeMap.put("CALC", "CALIFORNIA CITY");
		treeMap.put("DBLN", "DUBLIN");
		treeMap.put("FRFX", "FAIRFAX");
		
//      Iterating over the map
		System.out.println("Iterating over the map:");
		for(Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
//      Retrieving a value using a key
		System.out.println("\nRetrieving a value using a key");
		String key = treeMap.get("BER");
		System.out.println("BER stands for " + key);
		
//      Removing a key-value pair
		System.out.println("\nIterating over the map after removing a key-value pair - FAIRFAX:");
		treeMap.remove("FRFX");
		for(Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
//      Checking if a key exists
		System.out.println("\nChecking if a key exists:");
		if(treeMap.containsKey("CALC")) {
			System.out.println("CALIFORNIA CITY is in the TreeMap");
		}
		
		/*
		Iterating over the map:
		ALB:ALBANY
		BER:BERKELEY
		CALC:CALIFORNIA CITY
		DBLN:DUBLIN
		FRFX:FAIRFAX

		Retrieving a value using a key:
		BER stands for BERKELEY

		Iterating over the map after removing a key-value pair - FAIRFAX:
		ALB:ALBANY
		BER:BERKELEY
		CALC:CALIFORNIA CITY
		DBLN:DUBLIN

		Checking if a key exists:
		CALIFORNIA CITY is in the TreeMap
		*/
	}

}
