
public class RandomizeAnArray {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		
////////Fill array with numbers 1-4///////////////
		
		for(int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		
////////Randomise the numbers in the array by swapping their contents//////////////////
		
		int count = array.length-1;
		for(int i = 0; i < array.length; i= i+2){
			int temp = array[i];
			array[i] = array[count];
			array[count] = temp;
			count--;
		}
		for(int j = 0; j < array.length; j++){
			System.out.print(array[j]);
		}
	}

}
