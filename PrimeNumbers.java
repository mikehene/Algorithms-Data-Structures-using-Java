import java.util.Scanner;


public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		boolean result = false;
		
	    for(int i=2;i<=number/2;i++) {
	        if(number%i==0){
	            System.out.println(result);
	            break;
	    	}
		    else if(i == number/2){	
		    	result = true;
		    	System.out.println(result);
		    }
	    	
	    }
	}
}
