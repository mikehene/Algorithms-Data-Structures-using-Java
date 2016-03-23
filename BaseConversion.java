import java.math.BigInteger;
import java.util.Scanner;


public class BaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number you would like to convert");
		
		/*
		/////////// Using big integers ///////////////
		 
		BigInteger big = scan.nextBigInteger();
		String retrieval = big.toString();
		
		System.out.println("Enter the base you would like to convert to");
		int baseToConvertTo = scan.nextInt();
		
		System.out.println("Enter the base you want to convert from");
		int baseToConvertFrom = scan.nextInt();
		
		String result = new BigInteger(retrieval, baseToConvertFrom).toString(baseToConvertTo);
		System.out.println(result);*/
		
		//System.out.println(new BigInteger(retrieval, baseToConvertFrom).toString(baseToConvertTo));
		
		////////// Using Long ///////////////////////
		/*
		Long num = new Long(scan.nextLong());
		
		System.out.println("Enter the base you would like to convert to");
		int baseToConvertTo = scan.nextInt();
		
		String result = Long.toString(num, baseToConvertTo);
		
		System.out.println(result);
		
		*/
		
		
		////////// Using integers ///////////////////
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the base you would like to convert to");
		int baseToConvertTo = scan.nextInt();
		
		String result = Integer.toString(num, baseToConvertTo);
		
		if(baseToConvertTo == 16){
			if(result.charAt(0) == 'a'){
				System.out.println(10);
			}
			else if(result.charAt(0) == 'b'){
				System.out.println(11);
			}
			else if(result.charAt(0) == 'c'){
				System.out.println(12);
			}
			else if(result.charAt(0) == 'd'){
				System.out.println(13);
			}
			else if(result.charAt(0) == 'e'){
				System.out.println(14);
			}
			else if(result.charAt(0) == 'f'){
				System.out.println(15);
			}
			else{
				System.out.println(result);
			}
		}
		else if(baseToConvertTo == 2){
			
		}
	}
}
