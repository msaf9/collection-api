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
		// Initialize a HashMap to store student names as keys and their scores as
		// values
		Map<String, Integer> hashMap = new HashMap<>();

		// Variables to track the highest score and the corresponding student's name
		int high = 0; // Initially set to 0, assuming scores are non-negative
		String name = ""; // Stores the name of the student with the highest score

		// Add sample student names and their scores to the map
		hashMap.put("Alex", 9);
		hashMap.put("Carry", 1);
		hashMap.put("Bob", 59);
		hashMap.put("Dayton", 82);
		hashMap.put("Elf", 96);

		// Iterate through each entry in the map to find the student with the highest
		// score
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			// If the current score is greater than or equal to the highest score so far
			if (entry.getValue() >= high) {
				high = entry.getValue(); // Update the highest score
				name = entry.getKey(); // Update the name of the student with the highest score
			}
		}

		// Print the name of the student with the highest score
		System.out.println(name);
	}
}