package queue;

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
		
//		Print elements in sorted order using poll
		System.out.print("\nPolling elements in sorted order: ");
		while(!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}

	}

}
