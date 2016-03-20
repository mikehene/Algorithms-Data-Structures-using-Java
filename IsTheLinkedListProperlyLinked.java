import java.util.Scanner;

/* Problem - Check the double-ended doubly-linked list to see if it is properly linked up.  The main method is already completed, you
 * simply hve to write the check() method which reports to the main method.
 * Input - There is no input. The linked list is created automatically
 * Output - "TRUE" if the linked list is properly connected and "FALSE" otherwise. If the linked list is empty output "empty".
 */
public class IsTheLinkedListProperlyLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myscanner = new Scanner(System.in);
		int num = Integer.parseInt(myscanner.nextLine());
		Link[] array = new Link[num];
		for (int i = 0; i < num; i++) {
			array[i] = new Link(myscanner.nextLine());
		}
		while (myscanner.hasNext()) {
			int select = myscanner.nextInt();
			int previous = myscanner.nextInt();
			int next = myscanner.nextInt();
			if (previous != -1) {
				array[select].previous = array[previous];
			}
			if (next != -1) {
				array[select].next = array[next];
			}
		}
		LinkedList mylist = new LinkedList();
		if (num > 0) {
			mylist.first = array[0];
			mylist.last = array[num - 1];
		}
		System.out.println(check(mylist));
	}

	public static String check(LinkedList mylist) {
		
		// Long way //
		/*if (mylist.isEmpty()) {
			return ("empty");
		}
		Link[] checklist = new Link[100];
		Link forwards = mylist.first;

		int counter1 = 0;
		while (forwards.next != null) {
			checklist[counter1] = forwards;
			forwards = forwards.next;
			for (int i = 0; i < counter1; i++) {
				if (forwards == checklist[i]) {
					return ("FALSE");
				}
			}
			counter1++;
		}
		Link[] checklist2 = new Link[100];
		int counter2 = 0;
		Link backwards = mylist.last;
		while (backwards.previous != null) {
			checklist2[counter2] = backwards;
			backwards = backwards.previous;
			for (int i = 0; i < counter2; i++) {
				if (backwards == checklist2[i]) {
					return ("FALSE");
				}
			}
			counter2++;
		}
		if (backwards == mylist.first && forwards == mylist.last
				&& (counter1 == counter2)) {
			return ("TRUE");
		} else {
			return ("FALSE");
		}
	}*/
		
	// Shorter more efficient way //
		
	Link[] checklist = new Link[100];
	Link forward = mylist.first;
	if(mylist.isEmpty()){
		return ("empty");
	}
	while(true){
		if(forward.next == null){
			break;
		}
		else if(forward != forward.next.previous ){
			return ("FALSE");
		}
		forward = forward.next;
	}
	return ("TRUE");
	
}

class Link {
	public String data;
	public Link next;
	public Link previous;

	public Link(String input) {
		data = input;
		next = null;
		previous = null;
	}
}

class LinkedList {
	public Link first;
	public Link last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertHead(Link insert) {
		if (isEmpty()) {
			first = insert;
			last = insert;
		} else {
			first.previous = insert;
			insert.next = first;
			first = insert;
		}
	}
}
