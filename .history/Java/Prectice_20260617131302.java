import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3};

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max.append(arr[i]);
                arr[i]++;
            }
            
        }

        System.out.println("MAximum = " + max );
    }
}
