import java.util.Scanner;


public class SelectionSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How big will the array be?");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*10);
			//array[i] = scan.nextInt();
		}
		
		int min;
		for(int i = 0; i < array.length; i++){
			min = i;
			for(int j = i+1; j < array.length; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			int temp = array[i]; 
			array[i] = array[min]; 
			array[min] = temp;
		}

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		scan.close();
	}

}
