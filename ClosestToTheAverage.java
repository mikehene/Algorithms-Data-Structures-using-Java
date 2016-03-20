import java.util.Scanner;
/*  Problem - The goal is to read in a list of integers into an array and output the one which is closest to the average. 
* For example the average of 4, 8, 2, 3 and 5 is 4.25, and 4 is the closest to this. 
* If there are two values equally close then choose the one which was earliest in the list.
* Input - The first line contains N, the number of inputs. The second line contains N integers separated by a space.
* Output - A number that represents the value that is closest to the average
* Sample input - (7) - (15 18 3 2 -5 6 2)
* Sample output - 6
*/
public class ClosestToTheAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		int[] array = new int[size];
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
			total += array[i];
		}
		int average = total / size;
		
		int closest = Math.abs(array[0] - average);
		int index = 0;
		for (int i = 1; i < size; i++) {
			if (Math.abs(array[i]-average) < closest){
				closest = Math.abs(array[i]-average);
				index = i;
			}
		}
		System.out.println(array[index]);
		
		/* Or you can put into a seperate array with the differences from average
		 * 
		int[] array2 = new int[size];
		
		for (int i = 0; i < size; i++) {
			array2[i] = Math.abs(array[i] - average); // absolute value for neg
														// numbers
		}
		*/

	}
}