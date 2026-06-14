public class pens {
    String color;
    Stirng type;
   
    public void write() {
        System.out.println("writing something");
        
    }

}
public class Oops {
    public static void main(String[] args) {
        pens pen1=new pens();
        pen1.color="blue";
        pen1.type="gel";
      pen1.write();
    }
}