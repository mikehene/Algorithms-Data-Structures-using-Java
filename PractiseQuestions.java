
public class PractiseQuestions {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 5;
		array[1] = 7;
		array[2] = 9;
		array[3] = 11;
		
		int key = 8;
		int i = 0;
		while(array[i] < key && i < array.length-1){
			i++;
		}
		for(int j = i; j < array.length-1; j++){
			array[j] = array[j+1];
		}
		array[i] = key;
		
		for(int k = 0; k < array.length; k++){
			System.out.print(array[k] + " ");
		}
		
		
	}

}
