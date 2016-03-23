import java.util.Scanner;


public class InsertingAndRemovingElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*10);
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
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		int newEle = (int)(Math.random()*10);
		System.out.println("\nThe element to be inserted is " + newEle);
		System.out.println();
		int i = 0;
		int index = 0;
		while(array[i] < newEle && i < size-1){
			
			for(int j = size; j > i; j--){
				index = i;
			}
			i++;
		}
		
		for(int j = array.length-1; j >= index; j--){
			array[j] = array[j-1];
		}
		
		array[index] = newEle;
		
		for(int j = 0; j < array.length; j++){
			System.out.print(array[j] + " ");
		}
	}

}
