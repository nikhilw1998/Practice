package nikhil;

public class JavaArray {

	public static void main(String[] args) {
		
		Integer[] mark = new Integer[5];
		mark[0]=15;
		mark[1]=16;
		mark[2]=20;
		mark[3]=25;
		mark[4]=30;
		Integer[] k = {25,36,69};
		System.out.println(mark.length);
		System.out.println(mark[4]);
		for(int i=0;i<mark.length;i++) {
			System.out.print("{"+mark[i]+"}"+",");
		}
		
		Integer[] placed = new Integer[4];
		placed[0]=1;
		placed[1]=10;
		placed[2]=100;
		placed[3]=1000;
		
		
	}
}
