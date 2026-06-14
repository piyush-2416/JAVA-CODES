class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class TestRun {

    public static void DisplayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            if (temp == null) return -1; // safety check
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(70);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        DisplayList(a);

        int value = get(a, 3); // index 3 (0-based logic adjust if needed)
        System.out.println("Value at index: " + value);
    }
}