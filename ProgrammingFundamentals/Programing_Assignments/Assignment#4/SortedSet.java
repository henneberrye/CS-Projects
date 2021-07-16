/*
 * Eugene Henneberry
 * December 19, 2020
 * Programming Fundamentals
 * FA20-CPSC-21000-LT1
 * Programming Assignment #4: SortedSet
 */

import java.util.Scanner;

// Defines the a Sorted Set collection and implements a driver program in main
public class SortedSet {
	// Define a basic element of a linked list
	private class LinkedNode {
		int x; // Value stored in the node
		LinkedNode next; // Reference to the next node in the list
	}

	LinkedNode front = null; // Reference to the front of the singly linked list

	// Adds the integer x to the collection.
	// The resulting collection is sorted in increasing order and
	// does not contain any duplicate values.
	public void add(int x) {
		// Initialize a new node to be added to the collection
		LinkedNode newNode = new LinkedNode();
		LinkedNode cur = front;
		newNode.x = x;

		// Check if list is empty
		if (cur == null) {
			front = newNode;
		}
		// If list is not empty, check if node should be placed in front
		else if (front != null) {
			if (newNode.x < front.x) {
				newNode.next = front;
				front = newNode;
			}

			// If not in front, check for the middle or the end, or duplicate.
			else {
				cur = front;
				if (cur.next == null && cur.x != newNode.x) {
					cur.next = newNode;
				} else {
					int temp;
					LinkedNode prev = null;
					while (cur != null && cur.x != newNode.x) {
						prev = cur;
						if (cur.x > newNode.x && prev.x != newNode.x) {
							temp = cur.x;
							cur.x = newNode.x;
							newNode.x = temp;
							cur.next = newNode;
							cur = cur.next;
						} else if (cur.next == null && newNode.x > cur.x && prev.x != newNode.x) {
							cur.next = newNode;
							cur = cur.next;
						} else {
							cur = cur.next;
						}
						
					}

				}
			}
		}
	}

	// Deletes the integer x from the sorted set.
	// The remaining collection remains sorted and without duplicates.
	public void delete(int x) {
		// Declare a new reference and initialize it to the front of the list
		LinkedNode cur = front;

		// Check if list is empty
		if (front == null) {
			System.out.print("There is nothing to delete!");
		} else { // Not empty
			// Go through list, checking whether node is in the list, and delete if found
			if (front.x == x) {
				front = front.next;
			}
			LinkedNode prev = null;
			while (cur != null && cur.x != x) {
				prev = cur;
				cur = cur.next;
			}
			prev.next = cur.next;
		}
	}


	// Returns true if the integer x exists in the sorted set and false otherwise.
	public void exists(int x) {
		// Declare a new reference and initialize it to the front of the list
		LinkedNode cur = front;

		// Check if list is empty.
		if (front == null) {
			System.out.println("false");
		}

		// If not empty, check for the node.
		boolean isFound = false;
		while (cur != null) {
			if (cur.x == x) {
				isFound = true;
				System.out.println("true");
			} else if (cur.next == null && !isFound) {
				System.out.println("false");
			}
			cur = cur.next;
		}
	}

	// Returns a string representing the sorted set as a space separated list.
	public String toString() {
		String s = "";

		LinkedNode cur = front;
		while (cur != null) {
			s += cur.x + " ";
			cur = cur.next;
		}

		return s;
	}

	// Driver method
	public static void main(String[] args) {
		// Declare variables
		SortedSet sortedSet = new SortedSet();
		Scanner scan = new Scanner(System.in);
		String[] tokens;
		String command;
		int num;

		// Print header info
		System.out.println("Programming Fundamentals\n" + "NAME: Eugene Henneberry\n" + "PROGRAMMING ASSIGNMENT 4\n");

		// Enter command loop
		while (true) {
			// Prompt the user for a command
			System.out.print("Enter command: ");
			String input = scan.nextLine();

			// Parse input
			if (input.equals("q"))
				break; // user quits
			tokens = input.split("\\s");
			if (tokens.length < 2)
				continue; // invalid input
			command = tokens[0];
			num = Integer.parseInt(tokens[1]);

			// Execute command
			if (command.equals("add")) {
				sortedSet.add(num);
				System.out.println(sortedSet);
			} else if (command.equals("del")) {
				sortedSet.delete(num);
				System.out.println(sortedSet);
			} else if (command.equals("exists")) {
				sortedSet.exists(num);
			} else {
				System.out.print("Command does not exist");
			}
		}

		System.out.println("\nGood bye!");
	}
}
