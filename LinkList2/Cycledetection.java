public class Cycledetection {
    //Node class
    public  class Node{
        int data;
        Node next;

        //constructor 
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

public static Node head;

public static boolean isCycle(){
    Node slow=head;
    Node fast=head;

    while(fast!=null &&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
    }
    return false;
}



    public static void main(String args[]){
        //object creation
        Cycledetection ll=new Cycledetection();

        head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=head;

        System.out.println(isCycle());
    }
}
