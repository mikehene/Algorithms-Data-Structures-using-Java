import java.util.Scanner;
/*Problem - The goal is to read in a list of integers into an array, read in an integer x, and print out the xth biggest number.
 * For example given the list 4,8,2,3,5 and x is 2, then you should output 5 because 5 is the second biggest number in the list
 * Input - The first line contains N, the number of items in the list. tHe second line contains N integers separated by a space.
 * The third line contains an integer x
 * Ouput - An integer which is the xth biggest in the list
 * Sample Input - 5 - '4,8,2,3,5' - 2
 * Sample Ouput - 5
 */
public class FindTheXthBiggest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int search = scan.nextInt();

		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(array[size - search]);

	}

}
