import java.util.Arrays;
import java.util.Scanner;


public class MergeSortReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int N = Integer.parseInt(scan.nextLine());
	    
	    String[] array = new String[N];
	    
	    
	    // Enter the words into the array
	    for(int i = 0; i < N; i++){
	        array[i] = scan.nextLine();
	    }
	    
	    // Reverse the order of the letters in earch word
	    for(int i = 0; i < N; i++){
	        array[i] = reverse(array[i]);
	    }
	    
		// call the method to sort the array so that it is ordered lexigraphicolly from the last character backwards
		mergeSort(array);
		
		
		// Reverse the words back again so that they can be read
		for(int i = 0; i < N; i++){
	        array[i] = reverse(array[i]);
	    }
		
		// Print the array
	    for(int i = 0; i < N; i++){
	        System.out.println(array[i]);
	    }
		
		
	}
		
		public static void mergeSort(String[] workspace){
			
			if(workspace.length <= 1){  // If list is empty; no need to do anything
				return;
			}
			
			// split array in two halves 
			String[] list1 = new String[workspace.length/2];
			String[] list2 = new String[workspace.length - list1.length];
			
			// Copy the elements from the original array
			System.arraycopy(workspace, 0, list1, 0, list1.length);
			System.arraycopy(workspace, list1.length, list2, 0, list2.length);
			
			// Sort each half recursively
			mergeSort(list1);
			mergeSort(list2);
			
			merge(list1, list2, workspace);
			
			return;
			
		}
		
		public static void merge(String[] first, String[] second, String[] workspace){
			

			// starting element in the first array
			int iFirst = 0;
			
			// starting element in the second array
			int iSecond = 0;
			
			// The index of the array we are copying to
			int iMerge = 0;
			
			// Compare the two arrays and copy the smaller element to the next available index in the merged array
			
			while(iFirst < first.length && iSecond < second.length){
				if(first[iFirst].trim().compareToIgnoreCase(second[iSecond].trim()) < 0){
					workspace[iMerge] = first[iFirst];
					iFirst++;
				}
				else{
					workspace[iMerge] = second[iSecond];
					iSecond++;
				}
				iMerge++;
			}
			
			// Copy remaining elements over
			
			System.arraycopy(first, iFirst, workspace, iMerge, first.length - iFirst);
			System.arraycopy(second, iSecond, workspace, iMerge, second.length - iSecond);
			
		}	
		
		public static String reverse(String S){
			return new StringBuilder(S).reverse().toString();
		}
	}

