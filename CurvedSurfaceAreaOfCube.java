import java.util.Scanner;

class CurvedSurfaceAreaOfCube 
{    
   public static void main(String args[]) 
    {
         try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the side of cube:");
                 
             double side=s.nextDouble();
               
                 double  t=4*side*side;
 
                 System.out.println("CurvedSurfaceArea Of Cube is:" +t);
        }
   }
}