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
		
		System.out.println("::Phonebook Menu::");
		System.out.println("1. Add\n2. Remove\n3. Lookup\n");
		
		System.out.print("Select you options from 1 to 3:");
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			add(sc, phoneMap);
			break;
		case 2:
			remove(sc, phoneMap);
			break;
		case 3:
			find(sc, phoneMap);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
		sc.close();
	}

	private static void remove(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to remove: ");
		String remove = sc.next();
		phoneMap.remove(remove);
		System.out.println(phoneMap);
	}

	private static void find(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to find: ");
		String find = sc.next();
		System.out.println(find + ":" + phoneMap.get(find));
	}

	private static void add(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name: ");
		String key = sc.next();
		System.out.print("Enter your contact number: ");
		String value = sc.next();
		
		phoneMap.put(key, value);
		System.out.println(phoneMap);
	}

}
