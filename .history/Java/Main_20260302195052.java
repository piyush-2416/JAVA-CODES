import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int [] arr={10,24,32,1,4};
        int max=arr[0];

        for (int i=1;i<arr.length;i++){
         if(arr[i]>max){
            max=arr[i];

         }
System.out.println("largest number is :" + max);
        }
        

   
  }
}