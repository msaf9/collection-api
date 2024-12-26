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
		int option;

		do {

			System.out.println("::Phonebook Menu::");
			System.out.println("1. Add\n2. Remove\n3. Lookup\n");
			System.out.println("(0 to exit)\n");

			System.out.print("Select you options from 1 to 3:");
			option = sc.nextInt();

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
				if (option != 0) {
					System.out.println("Invalid option");
				} else {
					System.out.println("Exited as the user has selected option 0!");
				}
				break;
			}
		} while (option != 0);

		sc.close();
	}

	private static void remove(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to remove: ");
		String remove = sc.next();
		phoneMap.remove(remove);
		System.out.println(phoneMap + "\n");
	}

	private static void find(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to find: ");
		String find = sc.next();
		System.out.println("\n" + find + ":" + phoneMap.get(find) + "\n");
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
