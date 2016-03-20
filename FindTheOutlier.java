import java.util.Scanner;

/* Problem = The goal is to read in 3 numbers and ouput the one which is most different from the other two(i.e the one with the greatest difference
 * from the nearest number to it). If there is no single outlier then output "NA".
 * Input Format = Each line contains A, B and C separated by a space
 * Sample Input = 6, 3, 9 or 15, 18, 3
 * Sample Ouput = NA, 3
 */
public class FindTheOutlier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int average = (A + B + C) / 3;

		int Adif = Math.abs(A - average);
		int Bdif = Math.abs(B - average);
		int Cdif = Math.abs(C - average);

		if (Adif > Bdif && Adif > Cdif) {
			System.out.println(A);
		} else if (Bdif > Adif && Bdif > Cdif) {
			System.out.println(B);
		} else if (Cdif > Bdif && Cdif > Adif) {
			System.out.println(C);
		} else {
			System.out.println("NA");
		}
	}
}