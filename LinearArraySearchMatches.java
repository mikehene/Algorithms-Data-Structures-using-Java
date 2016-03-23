import java.util.Arrays;

public class LinearArraySearchMatches {
	public static void main(String[] args){
		
		int[] array = {10, 91, 20, 53, 91, 33, 98, 60, 28, 100};
		
////////////////// Sort array numerically //////////////////////
		
/////////// Method to sort array = Arrays.sort(array); /////////
		
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				int temp = 0;
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
///////////////// Print sorted array to show it has been sorted//////////////
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
//////////////// Search for a specific number in the array /////////////////
		int searchKey = 1;
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == searchKey){
				count++;
				System.out.println("\nThe number has been found at index; " + i);
			}
		}
		
		if(count > 0){
			System.out.println("We found the number " + count + " times");
		}
		else{
			System.out.println("\nWe couldn't find the number");
		}
	}
}

