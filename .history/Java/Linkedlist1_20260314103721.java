 class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;

    }
 }
 public class Linkedlist1{
    static Node insert (Node head,int data){
Node newNode=new Node(data);
newNode.next=head;
head=newNode;
return head;

    }
    static void print (Node head){
        while (head != null){
            System.out.println(head.data+"");
            head=head.next;

        }
    }
    public static void main(String[] args) {
        Node head =new Node(20);
        head.next=new Node(30);
        head = insert(head,70);
        print(head);
    }
    // public static void main(String[] args) {
    //     Node head=new Node(10);
    //     head.next=new Node(20);
    //     head.next.next=new Node(40);
    //     head.next.next.next=new Node(60);
  
    // Node temp=head;
    // while(temp !=null){
    //     System.out.println(temp.data + "");
    //     temp =temp.next;
    
    }
   