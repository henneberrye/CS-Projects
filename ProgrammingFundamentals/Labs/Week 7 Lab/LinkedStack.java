package AdditionalExamples;

// This class implements a Stack ADT as a linked list
public class LinkedStack {
	LinkedNode front; // Reference to the first LinkedNode in the list
	int count; // Number of nodes in the list

	// Constructor - initializes the front and count variables
	LinkedStack() {
		front = null;
		count = 0;
	}

	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
		newNode.next = front;
		front = newNode;
		count++;
	}

	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}

	// Implements the peek operation
	int peek() {
		return front.x;
	}

	// Implements the isEmpty operation
	boolean isEmpty() {
		return front == null;
	}

	// Implements the size operation
	int size() {
		return count;
	}

	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur != null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}

	// Modified LinkedStack to remove the bottom half
	public void removeBottomHalf(LinkedStack linkStack) {
		int half = 0;

		if (count % 2 != 0) {
			half = (count + 1) / 2;
		} else {
			half = count / 2;
		}
		LinkedNode temp = front;
		for (int i = 0; i < half - 1; i++) {
			temp = temp.next;
		}
		if (temp != null) {
			temp.next = null;
			count = half;
		}

	}
}
