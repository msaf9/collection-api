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
		
//		Accessing element from LinkedList
		String access = list.get(1);
		System.out.println("\nAccessing an element from LinkedList:");
		System.out.println(access);
		
//		Removing an element from LinkedList
		list.remove(0);
		System.out.println("\nLinkedList after removing an element:");
		System.out.println(list);
		
	/*
	    Output

	    Creating LinkedList:
	    [C, C++, Python, R, Java]

	    Iterating through LinkedList:
	    C
	    C++
	    Python
	    R
	    Java

	    Accessing an element from LinkedList:
	    C++

	    LinkedList after removing an element:
	    [C++, Python, R, Java]
	*/
		
	}

}
