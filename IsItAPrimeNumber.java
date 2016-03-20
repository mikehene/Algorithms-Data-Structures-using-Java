import java.util.Scanner;

/* Problem - The goal is to check if a number is prime or not. If it is a prime number, output TRUE, otherwise FALSE.
 * Input - An integer N
 * Output - Either TRUE, if the input is a prime number, or FALSE if it is not.
 * Sample Input - 8
 * Sample Output - FALSE
 */
public class IsItAPrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 2; i <= (N / 2 + 1); i++) {
			if (N >= 0 && N < 2) {
				System.out.println("FALSE");
				break;
			} else if (N % i == 0) {
				System.out.println("FALSE");
				break;
			} else if (i == N / 2 + 1) {
				System.out.println("TRUE");
			}
		}
	}
}