public class findmaxnumber {

      static int findmax(int a ,int b,int c ) {
      int max = a;
      if (b>max)max=b;
      if (c>max)max=c;
      return max;
    }
    public static void main(String[] args) {
    System.out.println("Max-Number ="+ findmax(23, 45, 98));
    }
}