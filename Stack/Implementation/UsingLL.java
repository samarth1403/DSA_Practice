import java.util.ArrayList;
public class UsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack {
        public static Node head = null;

       //isEmpty 
       public static boolean isEmpty(){
         return head == null;
       }

       //push
       public static void push(int data){
         Node newNode = new Node(data);
         if(isEmpty()){
            head = newNode;
            return;
         }
            newNode.next = head;
            head = newNode;
       }

       //pop
       public static int pop(){
        if(isEmpty()){
            return -1;
        }
         int value = head.data;
         head = head.next;
         return value;
       }
       
       //peek
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
       }
    }

    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}