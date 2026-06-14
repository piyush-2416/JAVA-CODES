public class findmaxnumber {

      static int findmax(int a ,int b,int c ) {
      if( a > max){
        System.out.println("a is greater ");
      }
      if(b>max){
        System.out.println("B is greater"+ b);
      }
      if (c>max){
        System.out.println("c is greater"+ c);
      }
      return max;
    }
    public static void main(String[] args) {
    System.out.println("Max-Number ="+ findmax(23, 45, 98));
    }
}