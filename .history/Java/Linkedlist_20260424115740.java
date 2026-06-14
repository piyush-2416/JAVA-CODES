class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Linkedlist {
    Node head;
    Node tail;

    // Add at head
    void addAtHead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Node a = new Node(10);
        Node b = new Node(20);
        list.addAtHead(50);

        Node c = new Node(30);
        Node d = new Node(40);
        list.addAtHead(30);
        list.addAtHead(90);
        list.addAtHead(10);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }}
