class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {

    Node head;

    // 1️⃣ Insert at End
    public void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 2️⃣ Insert at Position
    public void insertPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 3️⃣ Search Element
    public void search(int key) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Element found at position: " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println("Element not found");
    }

    // 4️⃣ Find Middle Node
    public void findMiddle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    // 5️⃣ Reverse Linked List
    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Display List
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Original List:");
        list.display();

        list.insertPosition(25, 3);

        System.out.println("After Insert at Position:");
        list.display();

        list.search(30);

        list.findMiddle();

        list.reverse();

        System.out.println("After Reverse:");
        list.display();
    }
}