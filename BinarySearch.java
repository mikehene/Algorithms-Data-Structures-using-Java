import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
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
		System.out.println("\nWhat number would you like to search for in the array?");
		int searchKey = scan.nextInt();
		
		int upperbound = size-1;
		int lowerbound = 0;
		int check = 0;
		
		
		while(true){
			check = (upperbound+lowerbound)/2;
			if(array[check] == searchKey){
				System.out.println("You found the number " + searchKey + " at index " + check);
				break;
			}
			else if(lowerbound > upperbound){
				System.out.println("The number could not be found");
				break;
			}
			else{ 
				if(array[check] > searchKey){
				upperbound = check-1;
				}
				else if(array[check] < searchKey){
					lowerbound = check+1;
				}
			}
		}
	}

}
