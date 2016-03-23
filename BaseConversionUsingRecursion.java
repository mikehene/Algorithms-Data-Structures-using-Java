import java.util.Scanner;


public class BaseConversionUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number you would like to convert");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the base you would like to convert to");
		int baseToConvertTo = scan.nextInt();
		
		String result = convert(num, baseToConvertTo);
		
		if(baseToConvertTo == 16){
			if(result.equalsIgnoreCase("10")){
				System.out.println('A');
			}
			else if(result.equals("11")){
				System.out.println('B');
			}
			else if(result.equals("12")){
				System.out.println('C');
			}
			else if(result.equals("13")){
				System.out.println('D');
			}
			else if(result.equals("14")){
				System.out.println('E');
			}
			else if(result.equals("15")){
				System.out.println('F');
			}
			else{
				System.out.println(result);
			}
		}
	}
	
	public static String convert(int number, int base)
	{
	    int quotient = number / base;
	    int remainder = number % base;

	    if(quotient == 0) // base case
	    {
	        return Integer.toString(remainder);      
	    }
	    else
	    {
	        return convert(quotient, base) + Integer.toString(remainder);
	    }            
	}
}
