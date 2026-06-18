import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {

        int[] arr = {90,4,6,7,8};

        int min =arr[0];

        for(int i = 0; i < arr.length; i++) {
         if(arr[i]<min){
            min=arr[i];

         }}
         System.out.println(min);
    }
}
