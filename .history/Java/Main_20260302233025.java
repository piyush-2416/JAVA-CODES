import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
      int arr[]={9,21,4,5,-6};
      int count =0;

       for(int i = 0; i<arr.length;i++){
        if (count<arr[i]){
            count++;
System.out.println("positive number  ");
    
        }
        else{
            System.out.println("negative number ");
        }
      }

//  positivenumber++;
    }
}