package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: Implement a phonebook application using a Map<String, String> where
 * the key is the person’s name, and the value is the phone number. The program
 * should allow adding, removing, and looking up contacts.
 */

public class MapProblem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> phoneMap = new HashMap<>();
		
		System.out.print("Enter your contact name: ");
		String key = sc.next();
		System.out.print("Enter your contact number: ");
		String value = sc.next();
		
		phoneMap.put(key, value);
		
		System.out.println(phoneMap);
		
		System.out.print("Enter your contact name to find: ");
		String find = sc.next();
		System.out.println(find + ":" + phoneMap.get(find));
		
		System.out.print("Enter your contact name to remove: ");
		String remove = sc.next();
		phoneMap.remove(remove);
		
		System.out.println(phoneMap);
		
		sc.close();
	}

}
