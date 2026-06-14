class TestRun {
    int val;
    Node next;

public static void DisplayList(Node head) {
    Node temp = head ;
    while (temp != null) {
        System.out.print(temp.val + "->");
        temp = temp.next;     
 
    }
}
private static int get (Node head ,int idx){
    for(int i=1;i<=idx;i++){
        temp=temp.next;
    
    }
    return temp.value;
    System.out.println(a,4);
    

}

public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);// Node@251a69d7
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
}
}