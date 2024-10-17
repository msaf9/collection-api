package list;

import java.util.ArrayList;
import java.util.List;

/**
 * A resizable array that offers fast random access and is best for frequent read operations.
 */

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Alex");
		list.add("Bob");
		list.add("Carry");
		
		System.out.println(list);
	}

}
