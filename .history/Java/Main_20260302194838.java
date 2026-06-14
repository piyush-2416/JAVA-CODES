import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int [] arr={10,24,32,1,4};
        int max=arr[0];

        for (int i=0;i<arr.length;i++){
         if(max>arr[i]){
            max=arr[i];

         }
System.out.println("largest number is :" + max(arr));
        }
        

   
  }
}