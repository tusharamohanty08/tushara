class Lcm {
    static int g;
    static int gcd (int a , int b)
    {
        int c;
        c = a%b;
        if(c==0)
        g=b;
        return g;
    }
    
    public static void main(String args[]) 
    {
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
        System.out.println("Enter two numbber..:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=gcd(a,b);
        int lcm=(a*b)/hcf;
        System.out.println("LCM("+a+","+b+")="+lcm);
    }    
    }
    
}