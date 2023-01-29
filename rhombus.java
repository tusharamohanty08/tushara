class findarea {   
    static int findAreaofrhombus(int d1, int d2)   
    {   
    int Area_of_rhombus;  
    Area_of_rhombus= ( d1 * d2 ) / 2; 
    return(Area_of_rhombus);   
    } 
    public static void main(String[] args)   
    {   
    int d1 = 20;  
    int d2 = 40;   
    System.out.println("The Area of a rhombus in Java:");  
    System.out.println(findAreaofrhombus(d1, d2));   
    }   
    }