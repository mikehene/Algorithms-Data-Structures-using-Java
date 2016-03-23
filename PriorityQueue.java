import java.util.Scanner;

public class PriorityQueue {
	public static void main(String args[]) throws Exception {

		Queue1 q = new Queue1(100);

		Scanner myScanner = new Scanner(System.in);

		// Read in a list of integers which are separated by spaces. 

		// this will just be all on one line - all on one line in the Scanner

		System.out.println("Enter a list of integers - just use any character except a number to finish");
		// ie 1 4 56 7 8 b ... the Scanner will not find an int at b. 

		while (myScanner.hasNextInt()) // keep looking for another integer along the scanner line
		{
			int nextIntFound = myScanner.nextInt(); // the nextInt() method takes cares of spaces. 

			// put this into our Priority Queue datastucture. 
			// check that it is in the range of values. 
			if ((nextIntFound <= 1000) && (nextIntFound >= -1000))
			{
				q.insert(nextIntFound);

				q.printQ(); // just for the purposes of example - let's look at the Queue at each step. 
				// you don't really need this. Just makes it easier to see the queue building. 
			}
			else
			{
				System.out.println("INSERT(" + nextIntFound + ") Cancelled ");
			}
		} // end while	

		// Now we have to get the sample output in the way as required. 
		// We just remove the elements in the queue one by one

		while (!q.isEmpty())
		{
			System.out.println(q.remove());
		}

	}


}

class Queue1 {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue1(int s) { // constructor
		maxSize = s;
		queArray = new int[maxSize];
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
	public void insert(int item) {
		
		System.out.println("\tINSERT(" + item + ")");
		if (nItems == 0) { // if no items,
			queArray[0] = item; // insert at 0
		} else { // if some items,
			int j = nItems; // start at end

			/****
			To change the priority of this queue - just change the > symbol in the queArray[j-1] > item clause
		**/
			/** Less than means that lower numbers have priority **/
			while (j > 0 && queArray[j - 1] < item) { // while new item larger
				queArray[j] = queArray[j - 1]; // shift upward
				j--; // decrement j
			}
			queArray[j] = item; // insert it
		}
		/*****/		
		front = nItems; // NEW LINE OF CODE FOR PRIORITY QUEUE.... 
		nItems++; // increase items
	}

	public int remove() { // take item from front of queue
		int temp = queArray[front]; // get value   
		front--; // We need to move the front back.... 
		if (front == maxSize) { // deal with wraparound
			front = 0;
		}
		nItems--; // one less item
		return temp;
	}

	public int peekFront() { // peek at front of queue
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
	
	public void temp(){
		return;
	}
}

