public class Stackusinglinkedlist {
    static class Node{
        int data;
        Node next;
        //creating a  constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        
        public static boolean isempty(){
            return head == null;
        }
        //push 
        public static void push(int data){
           Node  newNode= new Node(data);
            if(isempty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop
        public static int  pop(){
        if(isempty()){
            return -1;
        }
        // top ko islie bnye taki jo ham delte kr rhe us node ke data ko store krke  return kre
        int top=head.data;
        head=head.next;
        return top; // jo node delte kr rhe usko return kr rhe
    }
    //peek
    public static int peek(){
        if(isempty()){
            return -1;
        }
        return head.data;
    }
    }
    public static void main(String args[]){
            Stack s= new Stack();//object creataion
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
            }
            }
        }

