import java.util.Scanner;
/* Problem - Manipulate a queue according to the given insert and remove commands and then output the string that is in the middle of the queue. 
 * If there is an even number of strings in the queue, thus two middle strings, output the one which is nearest the front. 
 * If a remove command is issued for an empty queue then nothing should happen.
 * Input - A series of lines involving either INSERT or REMOVE commands. 
 * The command INSERT is followed by a space and then the string to insert (e.g. INSERT hello).
 * Output - Output the string that is in the middle of the queue following the given commands. 
 * If there are two middle strings, output the one nearest the front. If the queue is empty output "empty".
 * Sample Input - INSERT this, INSERT is, INSERT how, INSERT to, REMOVE, INSERT do, REMOVE INSERT it
 * Sample Output - to
 */
public class WhatsInTheMiddleOfTheQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue myQueue = new Queue(20);
		while (scan.hasNext()) {
			String command = scan.nextLine();
			if (command.equals("REMOVE")) {
				if (!myQueue.isEmpty()) {
					myQueue.remove();
				}
			} else {
				myQueue.insert(command.substring(7, command.length()));
			}
		}
		if (!myQueue.isEmpty()) {
			int middle = myQueue.size();
			if (middle % 2 == 1) {
				middle++;
			}
			middle = middle / 2;
			for (int i = 0; i < middle - 1; i++) {
				myQueue.remove();
			}
			System.out.println(myQueue.remove());
		} else {
			System.out.println("empty");
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
