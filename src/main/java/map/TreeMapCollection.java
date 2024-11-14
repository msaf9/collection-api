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
	}

}
