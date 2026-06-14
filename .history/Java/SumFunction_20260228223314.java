public class SumFunction {

      static int factorialnum(int n) {
      int fact=1;
   for (int i=1;i<=n;i++){
    fact *=i;
   }return fact;
    }
    public static void main(String[] args) {
   System.out.println("Factorial ="+ factorialnum(2));
    }
}