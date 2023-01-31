public class PerimeterOfParallelogram
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter length of adjacent side of parallelogram: ");
      double a = sc.nextDouble();
      System.out.println("Please enter another length of adjacent side of parallelogram: ");
      double b = sc.nextDouble();
      double perimeter = 2 * (a + b);
      System.out.println("perimeter of parallelogram is: " + perimeter);
      sc.close();
   }
}