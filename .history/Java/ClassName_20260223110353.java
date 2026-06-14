import java.util.Scanner;   // (optional) import statement

public class ClassName {
  

    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    int button=Sc.nextInt();
    switch (button) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("namashte");
      
        case 3:
            System.out.println("Piyush");
            break;
        case 4:
            System.out.println("shagun"); 
        break;
        
             default:System.out.println("invaild ");
    }
    }
}