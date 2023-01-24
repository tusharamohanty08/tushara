class Multiplication_Table{
    /**
     * @param args
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++)
        {
            System.out.println(num+"\t"+"*"+"\t"+i+"\t"+"="+"\t"+(num*!));
        }
        
    }
}