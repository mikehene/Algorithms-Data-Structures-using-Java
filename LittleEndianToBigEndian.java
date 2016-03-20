import java.util.*;

/* Problem - The goal is to convert a 32-bit integer from Little Endian to Big Endian. This is a ver common task in software 
 * Engineering. In Little Endian encoding the first byte contains the most significant bits, and bytes 2,3 and 4 decrease in
 * significance. In Big Endian encoding the first byte contains the least significan bits and bytes 2,3 and 4 increase in significance
 * Thus, to move from Little Endian to Big Endian the byte shuffling is as follows;
 * Byte 1 -> Byte 4
 * Byte 2 -> Byte 3
 * Byte 3 -> Byte 2
 * Byte 4 -> Byte 1
 * Take in an integer encoded in Little Endian, and shuffle its bytes using bit manipulation operators to put it into Big Endian.
 * Input - An Integer which represents n in 32-bit Litlle Endian format.
 * Output - An integer which represents n in 32-bit Big Endian format.
 * Sample Input - 3
 * Sample Output - 50331648
 */

public class LittleEndianToBigEndian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int base1 = num <<24;
		int base2 = ((num>>>8)<<24)>>>8;
		int base3 = ((num>>>16)<<24)>>>16;
		int base4 = num >>> 24;
		System.out.println(base1|base2|base3|base4);
	}

}
