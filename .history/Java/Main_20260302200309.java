import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int [] arr={13,2,32,12 ,9};
        // int max=arr[0];
        
        int count=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            count++;
        }

        }
        System.out.println("count is =" + count);

  }
}