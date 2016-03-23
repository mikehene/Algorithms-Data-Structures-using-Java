
public class InsertingAndGrowingArrays {
	
	static int dataLength = 6;
	static int dataSize = 0;
	
	static int[] array = new int[dataLength];
	
	public static void main(String[] args){
		insert(5);
		
////////////////Method go grow an array //////////////////	
	
		int[] doubleArray = new int[array.length * 2];
		for(int i = 0; i < array.length; i ++){
			doubleArray[i] = array[i];
		}
		array = doubleArray;
}
	
/////////////// Method to insert into an array///////////////
	
	public static void insert(int value){
		array[dataSize]= value;
		dataSize++;
	}
}
	
	

	
	
	

	



