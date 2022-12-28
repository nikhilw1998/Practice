package nikhil;

public class MargeArray {
	
	public static void main(String[] args) {
		
		int[] nik = {2,4,6,8,10,12};
		int[] net = {1,3,5,7,9};
		int[] marge = new int[nik.length+net.length];
		int c=0;
		for(int i=0;i<nik.length;i++) {
			marge[i]=nik[i];
			c++;
		}
		for(int j=0;j<net.length;j++) {
			marge[c++]=net[j];
		}
		for(int i =0;i<marge.length;i++) {
			System.out.println(marge[i]);
		}
	}
}
