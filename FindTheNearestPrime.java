import java.util.Scanner;

/* Problem - The goal is to read in a number and to output the nearest prime. If two primes are equidistant then output the lower one.
 * Input - An integer N
 * Output - The closest prime to N
 * Sample Input - 3856
 * Sample Output - 3853
 */
public class FindTheNearestPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] array = new int[N];

		int index = 0;
		for (int i = 2; i < N*2; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				} else if (j == i-1) {
					array[index] = i;
					index++;
				}
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int smallest = 0;
		int biggest = 0;
		boolean result = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == N) {
				result = true;
				break;
			}
			if (array[i] < N) {
				smallest = array[i];
			} else if (array[i] > N) {
				biggest = array[i];
				break;
			}
		}

		int result2 = Math.abs(smallest - N);
		int result3 = Math.abs(biggest - N);

		if (result == true) {
			System.out.println(N);
		} else if(N >=0 && N <= 2){
	        System.out.println("2");
	    }else if (result2 <= result3) {
			System.out.println(smallest);
		} else if (result3 < result2) {
			System.out.println(biggest);
		}
	}

}
