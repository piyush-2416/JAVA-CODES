public class pens {
    String color ;
   String types;
    public void write() {
        System.out.println("writing piyush ");
        
    }
   public void  PrintColor(){
    System.out.println(this.types);
} 

public class Oops {
    public static void main(String[] args) {
        pens pen1=new pens();
        pen1.color="blue";
        pen1.types="gel";
       pen1.write();

       pens pen2=new pens();
       pen2.color="black";
       pen2.types="ball point";
 pen2.PrintColor();
    

    }
}}