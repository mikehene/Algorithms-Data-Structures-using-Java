import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input how large you would like the array to be: ");
		int size = scan.nextInt();
		
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
		
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		int searchKey = (int)(Math.random()*100);
		System.out.println("\nThe number we are searching for is " + searchKey);
		System.out.println();
		
		int lowerBound = 0;
		int upperBound = array.length-1;
		int check = 0;
		boolean found = false;
		
		while(!found){
			check = (upperBound+lowerBound)/2;
			if(array[check] == searchKey){
				System.out.println("The number was found in index " + check);
				found = true;
			}
			else if(lowerBound > upperBound){
				System.out.println("Number not found!");
				break;
			}
			else{
				if(array[check] < searchKey){
					lowerBound = check+1; 
				} 
				else if(array[check] > searchKey){
					upperBound = check-1;
				}
			
			}
		}

		//find(array, 5);
		
	}
	
	public static int find(int[] array, int searchKey){
		
		int lowerBound = 0;
		int upperBound = array.length-1;
		int check = 0;
		
		while(true){
			check = (upperBound+lowerBound)/2;
			if(array[check] == searchKey){
				System.out.println(check);
				System.out.println(array[check]);
				return check;
			}
			else if(lowerBound > upperBound){
				System.out.println("Number not found!");
				return -1;
			}
			else{
				if(array[check] < searchKey){
					lowerBound = check+1; 
				}
				else if(array[check] > searchKey){
					upperBound = check-1;
				}
			
			}
		}
	}

}

