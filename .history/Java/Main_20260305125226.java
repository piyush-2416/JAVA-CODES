class ReversePrint{

    static void printReverse(int n){           

      if(n==0){
       return;
      }
 System.out.println();
 printReverse(n-1);
    }

    public static void main(String[] args){

  printReverse(5);   }
}
