class main{
    public static void main(String args []) {

        int n = 10, firstterm = 0, secondterm = 1;
        System.out.println("fibonacci series till" + n +"terms:");

        for (int i = 1; i <= n; i++) {
            System.out.println(firstterm + ",");

            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }

    @Override
    public String toString() {
        return "main []";
    }
}