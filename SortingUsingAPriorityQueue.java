import java.util.Scanner;

public class SortingUsingAPriorityQueue {
/* Problem - Use a priority queue to sort a list of numbers. Insert all the numbers into the priority queue and then remove them all.
 * Smaller numbers should have highest priority so they come out first. You need to write the priority queue yourself = but you can paste 
 * in most of the ccode from the lecture notes.
 * Input - A list of N unsorted integers separated by a space
 * Output - The list of sorted integers, from smallest to biggest, each on a separate line.
 * Sample input - 9 2 5 2 4
 * Sample Output - 1, 2, 4, 5, 9
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue myQueue = new Queue(100);

		while (scan.hasNextInt()) {
			myQueue.insert(scan.nextInt());
		}

		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.remove());
		}
	}
}

class Queue {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		maxSize = size;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int num) {
		if (nItems == 0) {
			queArray[0] = num;
		} else {
			int j = nItems;
			while (j > 0 && queArray[j - 1] > num) {
				queArray[j] = queArray[j - 1];
				j--;
			}
			queArray[j] = num;
		}
		nItems++;
	}

	public int remove() {
		int temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public int size() {
		return nItems;
	}

	public int peekFront() {
		return (queArray[front]);
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

}