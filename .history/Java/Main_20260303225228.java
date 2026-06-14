import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int [][] arr=new int[2][2];
         System.out.println("Enter 4 numbers:");
         for(int i=0;i<2;i++){
            for(int j=0;j < 2; j++){
arr[i][j]=sc.nextInt();
            }
         }
         System.out.println("MAtrix is :");
         for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
         }
    }
}