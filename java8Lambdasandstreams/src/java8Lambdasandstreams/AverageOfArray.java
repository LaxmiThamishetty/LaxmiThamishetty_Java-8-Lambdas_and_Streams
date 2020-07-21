package java8Lambdasandstreams;
//Average using streams
import java.util.Arrays; 
class AverageOfArray { 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; 
  
        
        int sum = 0; 
        
        sum = Arrays.stream(arr) 
                  .sum(); 
        System.out.println("Average using streams : " + 
                                   (sum / arr.length)); 
  
        
        System.out.println("Printing array elements : "); 
        Arrays.stream(arr) 
            .forEach(e->System.out.print(e + " ")); 
    } 
} 