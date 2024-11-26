package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCollection {

	public static void main(String[] args) {
//		Create a PriorityQueue of integers
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
//		Add elements to PriorityQueue
		pq.add(10);
		pq.add(5);
		pq.add(20);
		pq.add(15);
		
//		Print PriorityQueue
		System.out.println("PriorityQueue: " + pq);
		
//		Remove element 5
		pq.remove(5);
		System.out.println("\nPriorityQueue after removing an element (5): " + pq);
		
		System.out.println("\nPriorityQueue's peek: " + pq.peek());
		
		pq.add(1);
		
		List<Integer> list = new ArrayList<>(pq);
		Collections.sort(list);
		System.out.println("\nSort elements: " + list);
		
//		Print elements in sorted order using poll
		System.out.print("\nPolling elements in sorted order: ");
		while(!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
		
		/*
		PriorityQueue: [5, 10, 20, 15]

		PriorityQueue after removing an element (5): [10, 15, 20]

		PriorityQueue's peek: 10

		Sort elements: [1, 10, 15, 20]

		Polling elements in sorted order: 1 10 15 20
		*/
	}

}
