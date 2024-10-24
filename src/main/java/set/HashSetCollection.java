package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
//		Creating HashSet
		Set<String> set = new HashSet<>();
		set.add("NY");
		set.add("NJ");
		set.add("IA");
		set.add("Fl");
		set.add("MN");
		set.add("CA");
		set.add("NJ"); // Duplicate elements are ignored
		
//		HashSet elements
		System.out.println("HashSet contains the following elements");
		System.out.println(set); // Does not follow any order
		
		
//		Iterating through HashSet
		System.out.println("\nIterating through HashSet:");
		for(String item : set) {
			System.out.println(item);
		}
		
//		Check if an element exists in the HashSet
		System.out.print("\nWill print true, if CA is found in the HashSet:");
		System.out.println(set.contains("CA"));
		
//		Removing an element from HashSet
		set.remove("MN");
		System.out.println("\nHashSet after removing an element:");
		System.out.println(set);
	}

}
