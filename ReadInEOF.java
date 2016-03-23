import java.util.Scanner;


public class ReadInEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); // input the number of lines
        int k = 1; // Line number
        
        while(scan.hasNext()){ // Keep passing onto the next line until you reach EOF
            String input = scan.nextLine(); 
            System.out.println(k + " " + input);
            k++;
        }
	}

}
