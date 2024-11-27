package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Given a List<String>, reverse the list without using any built-in
 * reverse method.
 */

public class ListProblem2 {

	public static void main(String[] args) {
		// Create a List to store strings
		List<String> stringList = new ArrayList<>();
		// Create an empty List to store the reversed elements
		List<String> reverseStringList = new ArrayList<>();

		// Add elements to the original list
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		stringList.add("d");

		// Print the original list before reversing
		System.out.println("List<String> before reversing: " + stringList);

		// Call the method to reverse the list
		reverseStringList(stringList, reverseStringList);

		// Print the reversed list
		System.out.println("List<String> after reversing: " + reverseStringList);
	}

	/**
	 * Reverses the elements of the given list and stores them in another list.
	 *
	 * @param stringList        the original list of strings
	 * @param reverseStringList the list to store reversed elements
	 */
	private static void reverseStringList(List<String> stringList, List<String> reverseStringList) {
		// Loop through the original list in reverse order
		for (int i = stringList.size() - 1; i >= 0; i--) {
			// Add each element to the reversed list
			reverseStringList.add(stringList.get(i));
		}
	}

}