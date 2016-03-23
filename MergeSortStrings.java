import java.util.Arrays;


public class MergeSortStrings {
	
	public static void main(String [] args){
		
		String[] array = {" Hello ", " This ", "is ", "Sorting ", "Example"};
		
		// call the method to sort the array
		mergeSort(array);
		
		// print the array to the screen
		System.out.println(Arrays.toString(array));
	}
	
	public static String[] mergeSort(String[] workspace){
		
		if(workspace.length <= 1){  // If list is empty; no need to do anything
			return workspace;
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
		
		return workspace;
		
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
}
