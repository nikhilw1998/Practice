package nikhil;

import java.util.Arrays;

public class BasicArray {
	
	public static void main(String[] args) {
		int[] klm = {1,23,25,28,96,63,45};
		int[] mns= {};
		System.out.println("third element  "+klm[2]);
//		
//		for(int i=0;i<klm.length;i++) {
//			
//			
//		}
		System.out.println("Initial Array:\n"
                + Arrays.toString(klm));
		int n = 10;
		int x= 50;
		klm = addx(n, mns, x);
	}
}
