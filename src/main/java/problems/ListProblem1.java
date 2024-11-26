package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem: Write a Java program to remove duplicates from an ArrayList of
 * integers.
 */

public class ListProblem1 {

	public static void main(String[] args) {
//		 Create an ArrayList to store integers
		List<Integer> arrayList = new ArrayList<>();

//		 Add integers to the ArrayList, including duplicate values
		arrayList.add(23);
		arrayList.add(62);
		arrayList.add(1);
		arrayList.add(-121);
		arrayList.add(-2);
		arrayList.add(0);
		arrayList.add(1); // Duplicate
		arrayList.add(-121); // Duplicate
		arrayList.add(23); // Duplicate

//		 Print the original ArrayList with duplicates
		System.out.println("arrayList with duplicates: " + arrayList);

//		 Use a HashSet to remove duplicates from the ArrayList
//		 HashSet automatically filters out duplicate elements
		Set<Integer> hashSet = new HashSet<>(arrayList);

//		 Convert the HashSet back to an ArrayList to preserve list structure
		List<Integer> updatedArrayList = new ArrayList<>(hashSet);

//		 Print the ArrayList after removing duplicates
		System.out.println("\narrayList without duplicates: " + updatedArrayList);
	}

}
