public class SecondLargest{
 static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }}
    static class Stack{
        public static Node head;
        public static boolean is_empty(){
            return head==null;

        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(is_empty()){
                head =newNode;
            return;
  }
  newNode.next=head;
  head=newNode;
        }
        public static int pop(){
            if (is_empty()){
                return -1;

            }
            int top=head.data;
            head=head.next;
            return top;

        }
        //peek operation
        public static int peek(){
            if(is_empty()){
                return -1;

            }
            return head.data;

        }
    }
    Stack s=new Stack();
     s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    while(is_Empty()){
        System.out.println(s.peek());
        s.pop();
    }


}
