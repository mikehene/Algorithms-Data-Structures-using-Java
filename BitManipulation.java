import java.util.*;

public class BitManipulation {
	/*
	 * Problem - Find the largest integer that can be created from a pair of
	 * integers and the following bit manipulation operators: <<, >>, and |.
	 * Once the | operator is applied, the two inputs are consumed and cannot be
	 * referred to again. So you can shift the two original integers as much as
	 * you want, then apply the | operator to yield a result. Input - The first
	 * line and second line contain two integers n1 and n2. Output - Print the
	 * largest integer that can be created using n1 and n2 adn the bit
	 * manipulation operators <<, >> and |. Sample Input - 5, 6 Sample Output -
	 * 19461577056
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		int record = Integer.MIN_VALUE;
		for (int i = 0; i <= 32; i++) {
			for (int j = 0; j <= 32; j++) {
				if ((one << i | two << j) > record) {
					record = (one << i | two << j);
				}
				if ((one >> i | two << j) > record) {
					record = (one >> i | two << j);
				}
				if ((one << i | two >> j) > record) {
					record = (one << i | two >> j);
				}
				if ((one >> i | two >> j) > record) {
					record = (one >> i | two >> j);
				}
			}
		}
		System.out.println(record);
	}
}