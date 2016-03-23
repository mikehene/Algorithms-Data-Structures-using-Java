import java.util.Scanner;
import java.lang.Math;

public class BiggestDifference {
	String Marc;
	//int [][] ray = new int[][];
	void hi(){
		String Marc2;
		Marc2="hhh";
		System.out.println(Marc2);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int bigRes1 =0;
		int bigRes2 =0;
		int bigRes3 =0;
		int bigRes4 =0;
		int bigRes5 =0;
		int bigRes6 =0;
		
		int big = Math.max(Math.max(a, b), c);
		
		if(big == a){
			bigRes1 = big - b;
			bigRes2 = big - c;
		}
		else if(big == b){
			bigRes3 = big - a;
			bigRes4 = big - c;
		}
		else{
			bigRes5 = big - a;
			bigRes6 = big - b;
		}
		
		int biggestDifference1 = Math.min(Math.min(bigRes1, bigRes2), bigRes3);
		int biggestDifference2 = Math.min(Math.min(bigRes4, bigRes5), bigRes6);
		int biggestDifference;
		if(biggestDifference1 > biggestDifference2){
			biggestDifference = biggestDifference1;
		}
		else{
			biggestDifference = biggestDifference2;
		}
		
		////////////////smallest////////////////////
		
		int smalRes2 =0;
		int smalRes3 =0;
		int smalRes4 =0;
		int smalRes5 =0;
		int smalRes6 =0;
		int smalRes7 =0;
		
		int small = Math.min(Math.min(a, b), c);
		
		if(small == a){
			smalRes2 = small - b;
			smalRes3 = small - c;
		}
		else if(small == b){
			smalRes4 = small - a;
			smalRes5= small - c;
		}
		else{
			smalRes6 = big - a;
			smalRes7 = big - b;
		}
		
		int smallestDifference1 = Math.min(Math.min(smalRes2, smalRes3), smalRes4);
		int smallestDifference2 = Math.min(Math.min(smalRes5, smalRes6), smalRes7);
		int smallestDifference;
		if(smallestDifference1 > smallestDifference2){
			smallestDifference = smallestDifference1;
		}
		else{
			smallestDifference = smallestDifference2;
		}
		
		
		if(biggestDifference > smallestDifference){
			System.out.println(biggestDifference);
		}
		else{
			System.out.println(smallestDifference);
		}
	}

}
