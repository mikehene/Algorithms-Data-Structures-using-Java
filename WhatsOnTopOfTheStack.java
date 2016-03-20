import java.util.Scanner;
/* Problem - Manipulate a stack according to the given push and pop commands and then output the number that is at the top of the stack. 
 * If a pop command is issued for an empty stack then nothing should happen.
 * Input - The first line is a number N, which indicates the number of commands to follow. This is followed by N lines, each of which
 * consists of the word PUSH or POP. The word PUH will be followed by an integer n.
 * Output - Output the integer that is at the top of the stack fllowing the given commands. If the stack is empty output "empty".
 */

public class WhatsOnTopOfTheStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfComms = Integer.parseInt(scan.nextLine());
		Stack stack = new Stack(10);

		for (int i = 0; i < numOfComms; i++) {
			String command = scan.nextLine();
			if (command.equals("POP")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(Integer.parseInt(command.substring(5,
						command.length())));
			}
		}

		if (!stack.isEmpty()) {
			System.out.println(stack.peek());
		} else {
			System.out.println("empty");
		}

	}
}

class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int size) {
		maxSize = size;
		stackArray = new int[size];
		top = -1;
	}

	public void push(int letter) {
		top++;
		stackArray[top] = letter;
	}

	public int pop() {
		return stackArray[top--];
	}

	public int peek() {
		return stackArray[top];
	}

	public void makeEmpty() {
		top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
}
