import java.util.Scanner;


public class PermuteAStringUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string you would like to permute");
		String word = scan.nextLine();
		char[] array = word.toCharArray();
		array = permute(array, word.length()-1);
	}

	public static char permute(char[] a, int length) {
	     if (length == 1) {
	        System.out.println(a);
	        return a;
	     }
	     for (int i = 0; i < length; i++) {
	        swap(a, i, length-1);
	        permute(a, length-1);
	        swap(a, i, length-1);
	    }
	 }  
	 
	 public static void swap(char[] a, int i, int j) {
	    char c;
	    c = a[i]; 
	    a[i] = a[j]; 
	    a[j] = c;
	 }
}
