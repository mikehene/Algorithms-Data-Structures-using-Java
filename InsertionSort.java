import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How big will the array be?");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = scan.nextInt();
		}
		for(int i = 1; i < array.length; i++){
			int lowestNum = array[i];
			int j = i;
			while(j > 0 && array[j-1] >= lowestNum){
				array[j] = array[j-1];
				j--;
			}
			array[j] = lowestNum;
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		scan.close();
	}

}
