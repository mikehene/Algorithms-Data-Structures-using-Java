import java.util.Scanner;


public class PowerOfUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a whole number as your base element");
		int baseEle = scan.nextInt();
		
		System.out.println("Choose a whole number to raise to the power of");
		int powOf = scan.nextInt();
		
		int result = power(baseEle, powOf);
		System.out.println(result);
		
	}
	
	public static int power(int n, int k){ // Raise n to the power of k
		
		if(k == 0){
			return 1;
		}
		else{
			int t = power(n, k/2); // if odd will discard remainder
			if((n % 2) == 0){
				return t * t;
			}
			else{
				return n * t * t; // takes care of remainder when odd
			}
		}
	}

}
