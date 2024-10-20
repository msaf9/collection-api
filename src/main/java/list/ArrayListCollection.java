package list;

import java.util.ArrayList;

/**
 * A resizable array that offers fast random access and is best for frequent read operations.
 */

public class ArrayListCollection {

	public static void main(String[] args) {
		
//		Creating ArrayList
		ArrayList<String> list = new ArrayList<>();
		
//		Adding elements to ArrayList
		list.add("Alex");
		list.add("Bob");
		list.add("Carry");
		System.out.println("Creating ArrayList:");
		System.out.println(list);
		
//		Iterating through ArrayList
		System.out.println("\nIterating through ArrayList:");
		for(String item : list) {
			System.out.println(item);
		}
		
//		Accessing element from ArrayList
		String access = list.get(1);
		System.out.println("\nAccessing an element from ArrayList:");
		System.out.println(access);
		
//		Removing an element from ArrayList
		list.remove(0);
		System.out.println("\nArrayList after removing an element:");
		System.out.println(list);
		
	}

}
