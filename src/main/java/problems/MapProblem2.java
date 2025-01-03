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
		Scanner sc = new Scanner(System.in); // Create a Scanner for user input
		Map<String, String> phoneMap = new HashMap<>(); // Initialize the phonebook map
		int option; // Variable to store the user's menu choice

		// Loop until the user chooses to exit
		do {
			// Display the menu options
			System.out.println("::Phonebook Menu::");
			System.out.println("1. Add\n2. Remove\n3. Lookup\n4. View All\n");
			System.out.println("(0 to exit)\n");

			System.out.print("Select your option from 1 to 4: ");
			option = sc.nextInt(); // Read the user's choice

			// Perform actions based on the user's choice
			switch (option) {
			case 1:
				add(sc, phoneMap); // Call method to add a contact
				break;
			case 2:
				remove(sc, phoneMap); // Call method to remove a contact
				break;
			case 3:
				find(sc, phoneMap); // Call method to look up a contact
				break;
			case 4:
				viewAll(phoneMap); // Call method to view all contacts
				break;
			default:
				// Handle invalid option or exit
				if (option != 0) {
					System.out.println("Invalid option");
				} else {
					System.out.println("Exited as the user has selected option 0!");
				}
				break;
			}
		} while (option != 0); // Exit loop when user chooses 0

		sc.close(); // Close the Scanner to release resources
	}

	// Method to view all contacts in the phonebook
	private static void viewAll(Map<String, String> phoneMap) {
		System.out.println("View all:");
		// Iterate through each entry in the map and print the name and phone number
		for (Map.Entry<String, String> entry : phoneMap.entrySet()) {
			System.out.println("\n" + entry.getKey() + ": " + entry.getValue() + "\n");
		}
	}

	// Method to remove a contact from the phonebook
	private static void remove(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to remove: ");
		String remove = sc.next(); // Read the name of the contact to remove
		phoneMap.remove(remove); // Remove the contact from the map
		System.out.println(phoneMap + "\n"); // Print the updated map
	}

	// Method to look up a contact in the phonebook
	private static void find(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name to find: ");
		String find = sc.next(); // Read the name of the contact to find
		System.out.println("\n" + find + ": " + phoneMap.get(find) + "\n"); // Print the contact details
	}

	// Method to add a contact to the phonebook
	private static void add(Scanner sc, Map<String, String> phoneMap) {
		System.out.print("Enter your contact name: ");
		String key = sc.next(); // Read the name of the new contact
		System.out.print("Enter your contact number: ");
		String value = sc.next(); // Read the phone number of the new contact
		phoneMap.put(key, value); // Add the contact to the map
		System.out.println(phoneMap); // Print the updated map
	}
}
