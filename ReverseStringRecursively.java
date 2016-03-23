import java.util.Scanner;


public class ReverseStringRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to be reversed");
		String word = scan.nextLine();
		String revWord = reverseString(word);
		System.out.println(revWord);

	}

	public static String reverseString(String word) {
	     if(word == null || word.equals("")) // null is no string, "" is empty string
	        return word;
	     else
	        return reverseString(word.substring(1, word.length())) + 
	            word.substring(0,1); 
	  }
}
