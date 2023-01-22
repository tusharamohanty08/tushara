class Overload{
    void add(int  x,int y)
    {
      System.out.println(x+y);
    }
    void add(int x, int y,int z)
    {
        System.out.println(x+y+z);
    }
    void add(int x,float y)
    {
        System.out.println(x+y);
    }
    void add(float x,int y)
    {
        System.out.println(x+y);
    }
    public static void main(String arg[])
    {
    Overload ob=new Overload();
    ob.add(3.4f,5);
    ob.add(10,15);
    ob.add(2,3,5);
    ob.add(3,5.6f);    
    }
}