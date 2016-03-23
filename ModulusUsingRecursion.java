import java.util.Scanner;


public class ModulusUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the value");
		int value = scan.nextInt();
		
		System.out.println("Please input the divisor");
		int divisor = scan.nextInt();
		
		int result = modulus(value, divisor);
		System.out.println(result);
	}
	
	public static int modulus(int value, int divisor){
		if(value<divisor) {
			return value;
		}
		else{
			return modulus(value - divisor, divisor);
		}
	}
	/*
	if ( divisor==0 ) return 0;  
     boolean neg = val < 0; // if less than 0 set to true
     val = Math.abs(val); // allow for val to be a negative number
     divisor = Math.abs(divisor);  // allow for negative numbers
 	
     if (val < divisor)
         return neg ? -val : val;  // return neg or pos dependant on whether val is pos or neg
     else
 	return neg ? -modulus(val - divisor, divisor): // return one of two outcomes dependen on val being pos or neg
                    modulus(val - divisor, divisor);
	 */

}
