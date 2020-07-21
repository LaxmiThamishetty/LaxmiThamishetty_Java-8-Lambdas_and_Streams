package java8Lambdasandstreams;
import java.util.*; 
import java.util.function.Predicate; 

public class Stringstartingwithaandcontain3letters {
	public static void main(String args[]) {
        List<String> names = Arrays.asList("abcd","apple","abc","ate","klmn","App"); 
        
  
        Predicate<String> p =((s)->(s.startsWith("a") && s.length()==3)); 
       
        for (String st:names) { 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 
}
