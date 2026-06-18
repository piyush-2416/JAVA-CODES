import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int max = 0;

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i]>max){
                max = arr[i];
                i++;
            }
            
        }

        System.out.println("MAximum = " + max );
    }
}
