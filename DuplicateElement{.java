import java.util.Arrays;

class DuplicateElement{
    public static void main(String[]args) {
        int arr[]= {1,2,3,4,2,5,6,5,3,2,3,4,7,8,9,9,7};
        System.out.println("Dupilcate elements in given array");
        for(int i =0;i <arr.length;i++){
            for(int j =i+1; j <arr.length; j++){
                if (arr[i] == arr[j])
              System.out.println(arr[j]);
            }
        }
    }
}