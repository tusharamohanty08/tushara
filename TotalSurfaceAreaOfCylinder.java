import java.util.Scanner;

class TotalSurfaceAreaOfCylinder 
{
      public static void main(String args[]) 
   {   
    	try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the radius:");
         	
      		double r=s.nextDouble();
         	
		System.out.println("Enter the height:");
         	
		double h=s.nextDouble();
 
            	double  mm=((2*22*r)/7)*(r+h);
 
            	System.out.println("TotalSurfaceArea Of Cylinder is:  " + mm);
        }
       
 
     }
}