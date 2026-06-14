public class findmaxnumber {

      static int findmax(int a ,int b,int c ) {
      int max = a;
      if(b>max){
        System.out.println("B is greater"+b);
      }
      if (c>max){
        System.out.println("c is greater"+c);
      }
      return max;
    }
    public static void main(String[] args) {
    System.out.println("Max-Number ="+ findmax(23, 45, 98));
    }
}