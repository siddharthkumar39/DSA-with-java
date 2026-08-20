import org.w3c.dom.Node;

public class Doublylinklist {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add at first
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //remove first
    public int removefirst(){
        if(head==null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}
//reverse
public void reverse(){
    Node curr =head;
    Node prev=null;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;

        prev=curr;
        curr=next;
    }
    head=prev;
}

//print
public void print(){
    Node temp=head;
   // suruat v null se hi hota hai linklist pr usko nhi likh rhe System.out.println("null");
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.print("null");//lasst me
}
    public static void main(String args[]){
        Doublylinklist dll=new Doublylinklist();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.print();
        System.out.println();
        System.out.println("size:"+size);
        dll.removefirst();
        dll.print();
        System.out.println();
        System.out.println("reverse");
        dll.reverse();
        dll.print();;
    }
}
