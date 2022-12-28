package nikhil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFind {

	public static void main(String[] args) {
		//List<String> withDupes = Arrays.asList("Nikhil","wattamwar","tanish","nikhil","Nikhil","wattamwar","Wattamwar");
		
		List<Integer> withIntDupes = Arrays.asList(10,20,21,23,56,20,10,89,56,45);
		
		
//		List<String> withoutDupes=withDupes.stream().distinct()
//				.collect(Collectors.toList());
		
		List<Integer> withoutIntDupes=withIntDupes.stream().distinct()
				.collect(Collectors.toList());
		
		for(int i=0;i<withIntDupes.size();i++) {
			if(withoutIntDupes.get(i).equals(withIntDupes.get(i))) {
				 
				
		}
//		if(withoutIntDupes.equals(withDupes)) {
//			System.out.println("not dist");
		}
		//System.out.println(withoutDupes);
		System.out.println(withoutIntDupes);
		

		}
}
