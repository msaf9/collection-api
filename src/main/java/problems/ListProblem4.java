package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Write a Java program to find the common elements between two
 * ArrayLists of integers.
 */

public class ListProblem4 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> common = new ArrayList<>();
		
		list1.add(2);
		list1.add(4);
		list1.add(11);
		list1.add(41);
		list1.add(21);
		
		list2.add(11);
		list2.add(21);
		list2.add(4);
		list2.add(32);
		
		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.print("\nCommon elements between List1 and List2: ");
		
		for(int e1 : list1) {
			for(int e2 : list2) {
				if (e1 == e2) {
					common.add(e1);
				}
			}
		}
		
		System.out.print(common);
	}

}
