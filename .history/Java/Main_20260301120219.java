public class Main {

    static void  Tables(int num) {
       for(int i=1;i<=20;i++){
        System.out.println(num + "x" + i +'='+ (num * i));
       }
    }     

    public static void main(String[] args) {
    System.out.println("5 Table ");
        Tables(5);
     }
}