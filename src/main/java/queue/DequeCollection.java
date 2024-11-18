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
		
		System.out.println(deque);
	}

}
