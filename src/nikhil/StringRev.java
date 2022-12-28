package nikhil;

public class StringRev {

	public static void main(String[] args) {

		String str = "dad";
		char charq;
		String str1 = "";
		for(int i=0;i<str.length();i++) {
			
			charq=str.charAt(i);
			str1 = charq+str1;
		
		}
		//System.out.println(str1);
		
		if(str.equals(str1)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
