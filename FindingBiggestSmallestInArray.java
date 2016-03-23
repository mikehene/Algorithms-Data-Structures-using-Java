
public class FindingBiggestSmallestInArray {
	public static void main(String[] args){
		int[] array = {5, 99, 34, 63};
		
		int biggest = array[0];
		int index = 0;
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			if(array[i] > biggest){
				biggest = array[i];
				index = i;
			}
		}
		System.out.println("\nThe biggest number is " + biggest + " and is found in index; " + index);
		
		int smallest = array[0];
		index = 0;
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			if(array[i] < smallest){
				smallest = array[i];
				index = i;
			}
		}
		System.out.println("\nThe smallest number is " + smallest + " and is found in index; " + index);
	}
}
