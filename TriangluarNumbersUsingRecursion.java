import java.util.Scanner;


public class TriangluarNumbersUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What number would you like to calculate the sigma for?");
		int sig = scan.nextInt();
		int result = isTriangular(sig);
		System.out.println(result);
		scan.close();
	}
	
	public static int isTriangular(int n){
		if(n == 1){ // Base case, once reached one cannot go any lower
			return 1;
		}
		else{
			return n + isTriangular(n-1); // Returning the product of adding all numbers beneath said number until reaching base case i.e. Sigma
		}
	}

}
