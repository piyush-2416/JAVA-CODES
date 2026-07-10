import java.lang.reflect.Array;
import java.util.Arrays;

public class Prectice {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 5, 1, 3 };
        int largest = arr[0];
        int extra = 3;
        boolean[] newarr = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];}

            }
            for(int i=0;i<arr.length;i++){

            
                int Add = arr[i] + extra;

                if (Add >= largest) {
                    System.out.println(newarr[i] = true );
                    System.out.println(arr[i]);

                }else if(Add<largest){
                    newarr[i]=false;
                    System.out.println(newarr[i]);
                    System.out.println(arr[i]);
                }
            }
        }

    }

