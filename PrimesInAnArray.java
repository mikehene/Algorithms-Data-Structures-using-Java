import java.util.Scanner;


public class PrimesInAnArray {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array to be populated:");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int) (Math.random()*10);
		}
		
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				int temp = 0;
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("The array looks like this after being sorted;");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		boolean[] array2 = new boolean[size];
		
		for(int i =0; i < array2.length; i++){
			array2[i] = true;
		}
		
		for(int i = 0; i < array.length; i++){
			if((array[i] >= 0) && (array[i]<2)){
				array2[i] = false;
			}
			for(int j = 2; j < (array[i]/2)+1; j++){
				if(array[i] % j == 0){
					array2[i] = false;
					break;
				}
			}
		}
		System.out.println("The prime numbers in this array are: ");
		for(int i = 0; i < array2.length; i++){
			if(array2[i] == true){
				System.out.print(array[i] + " ");
			}
		}
	}
}
