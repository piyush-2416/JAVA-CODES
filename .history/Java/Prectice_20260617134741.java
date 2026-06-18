import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {

        int[] arr = {0, 92, 1,6,4,79, 3};

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                System.out.println("if"+  max);
                // i++;
            }
          
            // else{
            //     System.out.println("else"+  max);
            // }
        }
  System.out.println(arr[2]);
    }
}
