import java.util.Scanner;
/* Problem - The goal is to read in a list of integers into an array and output the one which ocurs most frequently. 
 * If there are two or more values that occur most frequently then choose the one which was earliest in the list.
 * Input - The first line contains N, the number of inputs. The second line contains N integers separated by a space
 * Output - The mode, that is, the number which occurs most frequently in the list.
 */

public class FindTheMode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int mostOccur = 0;
		int index = 0;

		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {
				if (array[j] == array[i]) {
					count++;
				}
				if (count > mostOccur) {
					mostOccur = count;
					index = i;
				}
			}
		}

		System.out.println(array[index]);
	}
}