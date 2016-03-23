import java.util.Scanner;


public class BubbleSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How big will the array be?");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*10);
		}
		
		for(int i = array.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

}
