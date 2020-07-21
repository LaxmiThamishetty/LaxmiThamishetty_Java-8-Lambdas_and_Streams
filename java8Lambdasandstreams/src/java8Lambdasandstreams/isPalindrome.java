package java8Lambdasandstreams;
import java.util.*; 
import java.util.function.Predicate; 
import java.lang.*;
import java.io.*;
public class isPalindrome {
	 

	static boolean reverse(String str){
		int i = 0, j = str.length() - 1; 
		  
        
        while (i < j) {  
             
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
           
            i++; 
            j--; 
        } 
  
        return true; 
	}
	public static void main(String args[]) {
		
        List<String> names = Arrays.asList("abba","aba","abb","klmn","kllllk"); 
       
        
        Predicate<String> p = ((s)->(reverse(s))); 
       
        for (String st:names) { 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 
}

