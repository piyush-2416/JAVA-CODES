class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Linkedlist {

    // Display Linked List
    public static void Displaylist(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get value at index
    private static int get(Node head, int idx) {
        Node temp = head;

        for (int i = 0; i < idx; i++) {
            if (temp == null) return -1;
            temp = temp.next;
        }

        if (temp == null) return -1;
        return temp.val;
    }

    public static void main(String[] arg) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Displaylist(a);

        int value = get(a, 2);
        System.out.println("Value at index: " + value);
    }
}