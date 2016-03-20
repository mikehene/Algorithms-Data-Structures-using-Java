import java.util.Scanner;
/* Problem - Maniputlate a queue according to the given insert and remove commands and then output the string that is at the front of
 * the queue. If a remove command is issued for an empty queue then nothing should happen.
 * Input - A series of lines involving either INSERT r REMOVE commands. The command INSERT is followed by a space and then the string
 * to insert(e.g.INSERT hello).
 * Output - Output the string that is at the front of the queue following the given commands. If teh queue is empty output "empty".
 * Sample Input - INSERT yes, INSERT we, REMOVE, INSERT can, REMOVE
 * Sample Output - can
 */

public class WhatsAtTheFrontOfTheQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue myQueue = new Queue(20);
		while (scan.hasNextLine()) {
			String command = scan.nextLine();
			if (command.equals("REMOVE")) {
				if (!myQueue.isEmpty()) {
					myQueue.remove();
				}
			} else {
				myQueue.insert(command.substring(7, command.length()));
			}
		}

		if (myQueue.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println(myQueue.remove());
		}
	}
}

class Queue {

	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s) {
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public boolean insert(String item) {
		if (!isFull()) {
			rear++;
			queArray[rear] = item;
			nItems++;
			return true;
		} else {
			return false;
		}
	}

	public String remove() {
		String temp = queArray[front];
		front++;
		if (front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}
}
