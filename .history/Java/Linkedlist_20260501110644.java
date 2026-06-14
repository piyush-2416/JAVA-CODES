class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Linkedlist {

    public static void Displaylist(Node head){
     Node head= temp;
      While(temp  !=null){
    System.out.println(temp.val +"->");
}
  System.out.println("null");

    }

    private static int get(Node  head,int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++{
            if(temp==null)return -1;
            temp=temp.next;
        
        return temp.val;
        })
    }

    public static void main(String[] arg) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(20);
        Node e = new Node(20);
        Node f = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Displaylist(a);
        int value=get(a,4);
        System.out.println("value at index"+value);
        // }
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(50);
        // Node f = new Node(60);
        // a.next = b;
        // b.next=c;
        // c.next=d;
        // d.next=e;
        // e.next=f;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f.val);
    }
}