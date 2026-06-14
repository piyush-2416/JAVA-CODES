// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class SecondLargest {
   public Linkedlist1() {
   }

   static Node insert(Node var0, int var1) {
      Node var2 = new Node(var1);
      var2.next = var0;
      return var2;
   }

   static void print(Node var0) {
      while(var0 != null) {
         System.out.println("" + var0.data);
         var0 = var0.next;
      }

   }

   public static void main(String[] var0) {
      Node var1 = new Node(20);
      var1.next = new Node(30);
      var1 = insert(var1, -1);
      print(var1);
   }
}
