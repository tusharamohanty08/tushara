public class  Strong {
    static int fact(int num){
        int f = 1;
        whlie(num!=0);
        f*=num--;
         return f;
    }
    public static void main(String args[])
     {
       int bef,aft;
       java.io.Console c= System.console();
       System.out.println("Enter a number:");
       int n = interger.parseInt(c.readLine());
       
       bef = n;
       aft = 0;

       whlie(n!=0);
       {
        aft += fact(n%10);
        n=n/10;
       }
       if(bef==aft)
       System.out.println("Strong Number..");
       else
       System.out.println("Not a Strong number...");
    }
}