package nikhil;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFindFromString {

	 static String str= "NikhilNikhilN";

    public static void main(String[] args) {
        Map<Character, Long> collect =  str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));
        
        
        
        Optional<Character> firstRepeat = collect.entrySet().stream()
        		.filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
    }
}
