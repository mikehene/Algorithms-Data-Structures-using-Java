import java.util.Scanner;
/* Problem - he goal is to read in a list of integers into an array and output the median. 
 * If there are two or more values  then choose the one which was earliest in the list.
 * Input - The first line contains N, the number of inputs. The second line contains N integers separated by a space.
 * Output - The median, that is, the number which occurs halfway into an ordered list.
 * Sample input - (7) - (15 18 3 2 -5 6 2)
 * Sample output - 2
 */

public class FindTheMedian {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int N = scan.nextInt();
	    double[] array = new double[N];
	    for(int i =0; i < N; i++){
	        array[i] = scan.nextInt();
	    }

	    int min;
	    for(int i = 0; i < array.length; i++){
	        min = i;
	        for(int j = i+1; j < array.length; j++){
	            if(array[j] < array[min]){
	                min = j;
	            }
	        }
	        double temp = array[i];
	        array[i] = array[min];
	        array[min] = temp;
	    }

	    double result;
	    if(N%2 == 0){
	        result = (array[(N/2)-1] + array[N/2])/2;
	    }
	    else{
	        result = array[(N-1)/2];
	    }
	    System.out.println(result);
	}
}
