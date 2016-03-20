import java.util.*;

/* Problem - The goal is to change a given number from one base to another.
 * Input - The first line contains an integer which is the base that the number N is represented in (base 1).
 * The second line contains an integer which is the base that the number N should be transformed into (base 2).
 * The third line contains an integer which represents N.
 * Output Print out number N in the approopriate base.
 */

public class ItsAllAboutTheBase {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
        int base1 = myscanner.nextInt();
        int base2 = myscanner.nextInt();
        int num = myscanner.nextInt();
        int value = 0;
        int power = 0; 

        while(num>0){ //turn it into base 10
            value+=(num%10)*Math.pow(base1,power);
            System.out.println("The value at this point is " + value);
            power++;
            num=(num-(num%10))/10;
            System.out.println("The num at this point is " + num);
        } 
        String solution="";
        while(value>0){ //transform into the desired base
            solution=(value%base2)+solution;
            System.out.println("The solution at this point is " + solution);
            value=(value-(value%base2))/base2;
            System.out.println("The value at this point is " + value);
        } 
        System.out.println(solution);     
	}

}
