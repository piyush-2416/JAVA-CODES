public class Stackclass{
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
    }
}