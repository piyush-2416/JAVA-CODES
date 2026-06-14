 
 abstract class Animal{
   abstract void walk();{

   }
   class Horse extends Animal{
      public void walk(){
System.out.println("walking on 4 legs ");
      }

   }
   class Chicken extends Animal{
      public void walk(){
         System.out.println("walking on 2 legs ");
      }
   }
   public class oops {
      public static void main(String[] args) {
         Horse horse = new Horse();
         horse.walk();   

        Chicken chicken=new Chicken();
         chicken.walk();
        }
   }
 }