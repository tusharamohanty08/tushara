import java.util.Scanner;

class PerimeterOfSquare
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the square:");
         
	 double a= s.nextDouble();
	 
         double  perimeter=4*a;
     
	 System.out.println("perimeter of Square is: " + perimeter);      
   }

public PerimeterOfSquare() {
}
}