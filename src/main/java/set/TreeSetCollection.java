package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		
//		Creating TreeSet
		Set<String> set = new TreeSet<>();
		set.add("NY");
		set.add("NJ");
		set.add("IA");
		set.add("Fl");
		set.add("MN");
		set.add("CA");
		set.add("NJ"); // Duplicate elements are ignored
		
//		TreeSet elements
		System.out.println("TreeSet contains the following elements");
		System.out.println(set); // Follows order
		
		
//		Iterating through TreeSet
		System.out.println("\nIterating through TreeSet:");
		for(String item : set) {
			System.out.println(item);
		}
		
//		Check if an element exists in the TreeSet
		System.out.print("\nWill print true, if CA is found in the TreeSet:");
		System.out.println(set.contains("CA"));
		
//		Removing an element from TreeSet
		set.remove("MN");
		System.out.println("\nTreeSet after removing an element:");
		System.out.println(set);
		
		/*
	    Output

	    TreeSet contains the following elements:
	    [CA, Fl, IA, MN, NJ, NY]

	    Iterating through TreeSet:
	    CA
	    Fl
	    IA
	    MN
	    NJ
	    NY

	    Will print true, if CA is found in the TreeSet: true

	    TreeSet after removing an element:
	    [CA, Fl, IA, NJ, NY]
	*/
		
	}

}
