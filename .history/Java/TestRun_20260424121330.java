class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
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

    void addAttail(int val) {
        Node temp = new Node(val);
        if (temp == null)
            head = tail = null;
        else {
            tail.next = temp;
            tail = temp;
        }
    }
}

public class TestRun {

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 0-based index
    public static int get(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            if (temp == null)
                return -1;
            temp = temp.next;
        }
        return temp != null ? temp.val : -1;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAtHead(11190);

        list.addAtHead(50);
        list.addAtHead(40);
        list.addAtHead(30);
        list.addAtHead(90);
        list.addAtHead(10);

        list.addAttail(90);
        list.addAtHead(120);

        displayList(list.head);

        int value = get(list.head, 7);
        System.out.println("Value at index: " + value);
    }
}