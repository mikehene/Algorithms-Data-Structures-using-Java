import java.util.Scanner;


public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What integer would you like the fibonacci for?");
		int input = scan.nextInt();
		int result = fib(input);
		System.out.println(result);
		scan.close();
	}
	
	
	public static int fib(int n){  // Not an effecient way to calculate fibonacci as every level doubles the number of recursive calls
		if(n==1) return 1;
		if(n==2) return 1; // first two elements always calculate the third ie 2
		else{
			return fib(n-1) + fib(n-2);
		}
	}

}
