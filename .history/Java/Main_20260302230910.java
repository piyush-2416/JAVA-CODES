import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
        int[] arr={2,3,5,7,8,6};
       int  count=1;

        for(int i=0;i<arr.length;i++){
        count = count *arr[i];
        // count++;
            System.out.println("Multiplication is :" + count);
        }



    }
}