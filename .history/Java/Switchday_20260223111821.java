import java.util.Scanner;   // (optional) import statement

public class Switchday {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Day number(1-7):");
    int day=sc.nextInt();

    switch(day) {
        case 1:
        System.out.println("Sunday");
        break;
        case 2:
        System.out.println("Monday");
        break;
        case 3:
        System.out.println("Tuesday");
        break;
        case 4:
        System.out.println("wedenday");
        break;
        default :System.out.println("Invaild");}

    }
 }



    