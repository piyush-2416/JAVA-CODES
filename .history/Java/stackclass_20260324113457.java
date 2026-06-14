 
 public class stackclass{
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data=data;
            next =null;
        }
    }
    static class stack{
        public static Node head;
        public static boolean is_Empty(){
            return head==null;
        }
        public static void main(String[] args) {
            Node newnode=new Node(data);
            if(is_Empty()){
                head=new Node;
                return;
            
            }
            newnode.next=head;
            head=newnode;
        }
        public static int POP(){
            if(is_Empty()){
                return -1;

            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //Peek operation
        public static int peek(){
            if(is_Empty()){
                return -1;
                return head.data;

            }
        }
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(is_Empty(){
            System.out.println(s.peek());
            s.POP()
        });
    }
 }