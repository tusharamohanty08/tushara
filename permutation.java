import java.util.ArrayList;

public class Permutation {  
    static int fact(int number) {  
       int f = 1;  
       int j = 1;  
       while(j <= number) {  
          f = f * j;  
          j++;  
       }  
       return f;  
    }  
    public static void main(String args[]) {            
       ArrayList<Integer> numbers = new ArrayList<Integer>();  
       numbers.add(15);  
       numbers.add(18);  
       numbers.add(17);  
       numbers.add(6);  
       numbers.add(29);           
       int n = numbers.size();  
       int r = 3;  
       int result;  
         
       result = fact(n) / fact(n-r);  
       System.out.println("The permutation value for the numbers list is: " + result);  
    }  
 }