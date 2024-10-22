package list;

import java.util.LinkedList;
import java.util.List;

/**
 * A doubly-linked list that is better for adding or removing elements frequently, especially in the middle of the list.
 */

public class LinkedListCollection {

	public static void main(String[] args) {
		
//		Creating LinkedList
		List<String> list = new LinkedList<>();

//		Adding elements to LinkedList
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("R");
		list.add("Java");
		System.out.println("Creating LinkedList:");
		System.out.println(list);
		
//		Iterating through LinkedList
		System.out.println("\nIterating through ArrayList:");
		for(String item : list) {
			System.out.println(item);
		}
	}

}
