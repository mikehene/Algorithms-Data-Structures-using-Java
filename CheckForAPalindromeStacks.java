import java.util.Scanner;
/*  Problem - Use a stack to check if a sentence is a palindrome or not. A palindromic sentence is one that reads the same forwards as
 * backwards when you ignore all the spaces. Only lower case letters and spaces will be used. If the sentence is palindromic output TRUE
 * otherwise output FALSE.
 * Input - An input word
 * Output - Either TRUE if it is a palindrome or FALSE otherwise
 * Sample input - ten animals i slam in a net
 * Sample output - TRUE
 */
public class CheckForAPalindromeStacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int size = word.length();

		String newWord = "";
		int index = 0;
		for(int i = 0; i < size; i++){
			if(word.charAt(i) != ' '){
				newWord  += word.charAt(i);
				index++;
			}
		}
		
		newWord.toLowerCase();
		
		Stack stack = new Stack(word.length());
		
		
		for(int i =0; i < newWord.length(); i++){
			stack.push(newWord.charAt(i));
		}
		
		/*while(!stack.isEmpty()){
			System.out.print(stack.peek());
			stack.pop();
		}*/

		for (int i = 0; i < newWord.length(); i++) {
			if (stack.peek() == newWord.charAt(i)) {
				stack.pop();
				if (i == newWord.length()-1) {
					System.out.println("TRUE");
				}
			} else {
				System.out.println("FALSE");
				break;
			}
		}
	}
}

class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int size) {
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char letter) {
		top++;
		stackArray[top] = letter;
	}

	public char pop() {
		return stackArray[top--];
	}

	public char peek() {
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
