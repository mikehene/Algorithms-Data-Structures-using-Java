import java.util.*;

public class SelectionAlgorithmSortingStrings{
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        String[] array = new String[size];
        
        for(int i = 0; i < array.length; i++){
        	array[i] = scan.next();
        }
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
        	System.out.print(array[i] + " ");
        }
        scan.close();
    }
}