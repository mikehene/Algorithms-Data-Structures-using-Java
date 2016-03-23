
public class BigOperators {

	public static void main(String[] args) {
		// work with big operators in Java. 
        // Use the Integer.toBinaryString method to print out in Binary. 
        // 32 bit integers. 

        int number1 = -11;
        int number2 = 1;
        System.out.println("Number 1 [" + number1 + "] in Binary " + Integer.toBinaryString(number1));
        System.out.println("Number 2 [" + number2 +"] in Binary " + Integer.toBinaryString(number2));
        int answer = number1  >>> number2;
        System.out.println("Number1 >>> number 2 in Integer " + answer );
        System.out.println("Number1 >>> number 2 in Binary "  + Integer.toBinaryString(answer) );

        int num = 1012;
        int byte1 = num<<24; // shift left 

        int num1 = 10;
        int num2 = 89;
        int j = 0;
        int i = 31;
        System.out.println((num1<<i)|(num2<<j));
	}
}
