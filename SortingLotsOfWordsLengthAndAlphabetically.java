import java.util.*;

/* Problem - The goal is to sort a long list of words by special order. The special order is as follows. All the words are sorted
 * by length starting with the shortest words, and ending with the lonest words. For words that have the same length, these should
 * be sorted alphabetically [a-z].
 * Input - The first line contains N (nubmer of words) followed by N lline. Eache line contains a String. There are only five test
 * cases, and each one involves 10 times more words than the last (e.e. 10, 100, 1,000, 10,000, 100,000).
 * Output - Print out each of the sorted N words on a separate line.
 */

public class SortingLotsOfWordsLengthAndAlphabetically {
	
	public static String[] myarray;
	public static String[] workSpace;
	

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        myarray = new String[num];
        workSpace = new String[num];
        for(int i=0;i<num;i++){
            myarray[i]=myscanner.nextLine();
        }
      
        mergeSort(0, num-1);
        
        for(int i=0;i<num;i++){
            System.out.println(myarray[i]);
        }
    }
    
    public static void mergeSort(int left, int right){
        int mid = (left + right) /2;  // computes midpoint
        if(left==right)		//base case
	   	   return;
        mergeSort(left, mid);
        mergeSort(mid+1, right);
        for(int i=left; i<=right; i++){
            workSpace[i]=myarray[i]; //copies entire array into workspace
        }
        int i1=left;
        int i2=mid+1;
        for(int curr=left; curr<=right; curr++){ //merge workspace
            if(i1>mid){			      //copies all remnants in
			     myarray[curr]=workSpace[i2++]; 
            }else if(i2>right){		      //copies all remnants in
                myarray[curr] = workSpace[i1++]; 
            }else if(check(workSpace[i2], workSpace[i1])){	   
                myarray[curr]=workSpace[i1++];	//merge
            }else{
                myarray[curr]=workSpace[i2++];	//merge
            }
        }
    }
    
    public static boolean check(String one, String two){
        
        if(one.length() == two.length()){
            if(one.compareToIgnoreCase(two) > 0){
                return true;
            }
            else{
                return false;
            }
        }
        else if(one.length() > two.length()){
            return true;
        }
        else{
            return false;
        }
            
    }
    
}