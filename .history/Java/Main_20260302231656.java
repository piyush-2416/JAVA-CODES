import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
        int[] arr={1,2,3,4,5};
       int find = 2;
    //    boolean found=false;
       for(int i =0 ;i<arr.length;i++){
        // found=true;
        if( find ==arr[i]){
            System.out.println("number is existing in this arrays " + arr[i]);
        }
        else{
            System.out.println("number is not existing in this arrays "+ find);
        }
       }



    }
}