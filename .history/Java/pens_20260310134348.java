public class pens {
    String color ;
   String types;
    public void write() {
        System.out.println("writing piyush ");
        
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
     pen2.write();
System.out.println(pen1.color);
System.out.println(pen1.types);
System.out.println(pen2.color);
System.out.println(pen2.color);


    }
}}