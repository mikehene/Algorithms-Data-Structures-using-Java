import java.util.Scanner;

/* Taking in a number of INSERTS AND REMOVES, return the Lexicographically highest String. 
 * Only insert the string after the INSERT command and return empty if priority queue is empty at the end of the commands*/
public class PriorityQueuesReturningLexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue1 q = new Queue1(20);

		System.out.println("Please enter the next string");
		for (int i = 0; i < 5; i++) {
			String command = scan.nextLine();
			if (command.substring(0, 6).equals("REMOVE")) {
				if (!q.isEmpty()) {
					q.remove();
				}
			} else {
				String input = command.substring(7);
				q.insert(input);
			}
		}

		if (q.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println(q.remove());
		}

	}

	static class Queue1 {
		private int maxSize;
		private String[] queArray;
		private int front;
		private int rear;
		private int nItems;

		public Queue1(int s) { // constructor
			maxSize = s;
			queArray = new String[maxSize];
			front = 0;
			rear = -1;
			nItems = 0;
		}

		public void printQ() {
			System.out.print("\t\tQUEUE Contents: ");
			for (int i = 0; i < nItems; i++) {
				System.out.print("[" + queArray[i] + "]");
			}
			System.out.println("");
		}

		public void insert(String item) {

			System.out.println("\tINSERT(" + item + ")");
			if (nItems == 0) { // if no items,
				queArray[0] = item; // insert at 0
			} else { // if some items,
				int j = nItems; // start at end

				/****
				 * To change the priority of this queue - just change the >
				 * symbol in the queArray[j-1] > item clause
				 **/
				/** Less than means that lower numbers have priority **/
				while (j > 0 && queArray[j - 1].compareTo(item) > 0) { // while
																		// new
																		// item
																		// larger
					queArray[j] = queArray[j - 1]; // shift upward
					j--; // decrement j
				}
				queArray[j] = item; // insert it
			}
			/*****/
			front = nItems; // NEW LINE OF CODE FOR PRIORITY QUEUE....
			nItems++; // increase items
		}

		public String remove() { // take item from front of queue
			String temp = queArray[front]; // get value
			front--; // We need to move the front back....
			if (front == maxSize) { // deal with wraparound
				front = 0;
			}
			nItems--; // one less item
			return temp;
		}

		public String peekFront() { // peek at front of queue
			return queArray[front];
		}

		public boolean isEmpty() { // true if queue is empty
			return (nItems == 0);
		}

		public boolean isFull() { // true if queue is full
			return (nItems == maxSize);
		}

		public int size() { // number of items in queue
			return nItems;
		}

		public void temp() {
			return;
		}
	}
}