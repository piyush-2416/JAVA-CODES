class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;

    }


public class  TestRun{
    public static void main(String[] arg) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(20);
        Node e = new Node(20);
        Node f = new Node(20);
        a.next = b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
 

    }
}}