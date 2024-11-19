package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCollection {

	public static void main(String[] args) {
//		Creating a Deque
		Deque<String> deque = new ArrayDeque<>();
		
//		Adding elements to Deque
		deque.addFirst("First");
		deque.addLast("Second");
		deque.addLast("Third");
		
//		Print Deque
		System.out.println("Print Deque:");
		System.out.println(deque);
		
//      Iterating over the Deque
		System.out.println("\nIterating over the Deque:");
		for(String element : deque) {
			System.out.println(element);
		}
		
//		Accessing element from Deque
		String access = deque.getFirst();
		System.out.println("\nAccessing an element (first) from Deque:");
		System.out.println(access);
		
		String access1 = deque.getLast();
		System.out.println("\nAccessing an element (last) from Deque:");
		System.out.println(access1);
		
//		Removing an element (first) from Deque
		deque.removeFirst();
		System.out.println("\nDeque after removing the first element:");
		System.out.println(deque);
		
//		Removing an element (last) from Deque
		deque.removeLast();
		System.out.println("\nDeque after removing the last element:");
		System.out.println(deque);
		
//		Adding elements to Deque
		deque.addFirst("fourth");
		deque.addLast("First");
		System.out.println(deque);
		
//		Removing an element from Deque
		deque.remove();
		System.out.println("\nDeque after removing the element:");
		System.out.println(deque);
		
		/*
		Print Deque:
		[First, Second, Third]

		Iterating over the Deque:
		First
		Second
		Third

		Accessing an element (first) from Deque:
		First

		Accessing an element (last) from Deque:
		Third

		Deque after removing the first element:
		[Second, Third]

		Deque after removing the last element:
		[Second]

		Adding elements to the Deque:
		[fourth, Second, First]

		Deque after removing an element:
		[Second, First]
		*/
	}

}
