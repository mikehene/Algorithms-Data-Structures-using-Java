import java.util.Scanner;


public class GCDUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		System.out.println("Enter the modulus");
		int mod = scan.nextInt();
		
		int GCD = gcd(number, mod);
		System.out.println(GCD);

	}
	
	public static int gcd(int number, int secondNum) {
        if (secondNum == 0)
            return number;
        else
            return gcd(secondNum, number%secondNum);
    }

}
