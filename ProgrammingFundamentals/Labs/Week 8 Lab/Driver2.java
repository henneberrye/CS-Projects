import java.util.*;

public class Driver {

	public static void main(String[] args) {
		int[] dataArray = {1,7,3,4,9,2};

		// Creates a new instance of ArrayQ
		ArrayQ arrQ = new ArrayQ();
		LinkedQueue linkQ = new LinkedQueue();

		System.out.println("Elements to be enqueued to ArrayQ: 1, 7, 3, 4, 9, 2 \n");

		for(int i = 0; i < dataArray.length; i++){
			arrQ.enqueue(dataArray[i]);
			System.out.println("\nNumbers being dequeued " + arrQ.dequeue());

		}
		System.out.println("\nNumbers left in the queue " + arrQ.size());

		System.out.print("\nElements to be enqueued to LinkedQueue: 1, 7, 3, 4, 9, 2 \n");

		for(int i = 0; i < dataArray.length; i ++) {
			linkQ.enqueue(dataArray[i]);
			System.out.println("\nNumbers being dequeued " + linkQ.dequeue());

		}
		System.out.println("\nNumbers left in the queue " + linkQ.size());

		System.out.println("\nExercise 2 \n");
		System.out.println("Elements to be enqueued to LinkedQueue: 1, 7, 3, 4, 9, 2, \n");
		for(int i = 0; i < dataArray.length; i ++) {
			linkQ.enqueue(dataArray[i]);
		}
			System.out.println("Middle number that is removed: " + linkQ.removeMiddle());
	}

}
