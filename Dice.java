import java.util.Scanner;
import java.lang.Math;

public class Dice {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rolls;");
		int numOfTimes = scan.nextInt();
		
		int[] array1 = new int[11];
		int[] array2 = new int[11];
		int count = 2;
/////Set the possible totals into array 1///////////
		for(int i = 0; i < array1.length; i++){
			array1[i] = count;
			count++;
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		
///////// Generate dice and check what the total is and then increment count in array 2/////////////
		for(int j = 0; j < numOfTimes; j++){
			int dice1 = (int)(Math.random()*6)+1;
			System.out.println(dice1);
			
			int dice2 = (int)(Math.random()*6+1);
			System.out.println(dice2);
			
			sum = dice1 + dice2;
			System.out.println("the sum of the two die is " + sum + "\n");
			
			for(int k = 0; k < array1.length; k++){
				if(sum == array1[k]){
					array2[k]++;
				}
			}
		}
		int total =0;
		for(int m = 0; m < array2.length; m++){
			total+=array2[m];
		}
		System.out.println("Total: "+ total);
		System.out.println();
	

	
/////////// Calculate the average number of times each total occured///////////
		for(int x = 0; x < array2.length; x++){
			if (array2[x]>0){
				array2[x] = ((array2[x]*100/numOfTimes));//*100);
			}
			System.out.print(array2[x] + ",");
		}
		System.out.println();
	
	
/////////// Print results in tabulated form ///////////////////////////
		System.out.println("Here is a table of the % of times the total of two randomly die occured");
		for(int y = 0; y < array2.length; y++){
			System.out.print(array1[y] + "\t");
			System.out.println(array2[y] + "%");
		}
	}
}

