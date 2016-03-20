import java.util.Scanner;
/*The ogal is to sort a long list of words by special order, namely the usual [a-z] alphabetical order, but considering the words in 
 * an inverted fashion. The last letter in the word has the greatest significance, the second last letter has the second greatest 
 * significance, the third letter has the third greatest significance and so forth...
 * Input - The first line contains N (number of words) followed by N lines. Each line contains a String.There are only five test
 * cases, and each one involves 10 times mor words than the last (e.g. 10 ,100, 1,000, 10,000, 100,000).
 * Output - Print out each of the sorted N words on a seperate line.
 */
public class SortingLotsOfWords { 

	public static String[] myarray;
	public static String[] workSpace;
	
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        String[] array = new String[num];
        myarray = new String[num];
        workSpace = new String[num];
        for(int i=0;i<num;i++){
            myarray[i]=myscanner.nextLine();
        }
      
        mergeSort(0,array.length-1);
 
        for(int i=0;i<num;i++){
            System.out.println(myarray[i]);
        }
    }
    
public static void mergeSort(int left, int right){
    int mid = (left + right) /2;  // computes midpoint
    if(left==right)        //base case
        return;
    mergeSort(left, mid);
    mergeSort(mid+1, right);
    for(int i=left; i<=right; i++){
        workSpace[i]=myarray[i]; //copies entire array into workspace
        
    }
    int i1=left;
    int i2=mid+1;
    for(int curr=left; curr<=right; curr++){ //merge workspace
        if(i1>mid){                  //copies all remnants in
            myarray[curr]=workSpace[i2++]; 
        }else if(i2>right){              //copies all remnants in
            myarray[curr] = workSpace[i1++]; 
        }else if(check(workSpace[i2],workSpace[i1])){       
            myarray[curr]=workSpace[i1++];    //merge
        }else{
            myarray[curr]=workSpace[i2++];    //merge
        }
    }
}

  
    public static void quickSort(String[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
 
        if (low>=high)
            return;
 
        // pick the pivot
        int middle = low + (high - low) / 2;
        String pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (check(pivot,arr[i])) {
                i++;
            }
 
            while (check(arr[j],pivot)) {
                j--;
            }
 
            if (i <= j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
 
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
 
        if (high > i)
            quickSort(arr, i, high);
            
    }
    
    public static boolean check(String one, String two){
        String reverseone="";
        String reversetwo="";
        
        for ( int i = one.length() - 1 ; i >= 0 ; i-- ){
                reverseone = reverseone + one.charAt(i);
            }
        for ( int i = two.length() - 1 ; i >= 0 ; i-- ){
                reversetwo = reversetwo + two.charAt(i);
            }
         
            if(reverseone.compareTo(reversetwo)>0){
            return true;
        }else{
               return false;
        }
     }    
}