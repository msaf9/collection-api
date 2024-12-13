package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Write a Java program that takes a list of student names and their
 * scores, then returns the name of the student with the highest score using a
 * Map<String, Integer>.
 */

public class MapProblem4 {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		int high = 0;
		String name = "";
		
		hashMap.put("Alex", 9);
		hashMap.put("Carry", 1);
		hashMap.put("Bob", 59);
		hashMap.put("Dayton", 82);
		hashMap.put("Elf", 96);
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() >= high) {
				high = entry.getValue();
				name = entry.getKey();
			}
		}
		
		System.out.println(name);
	}

}
