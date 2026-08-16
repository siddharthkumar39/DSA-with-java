public class AddinLinklist {
    //class for node
    public class Node{
        int data;
        Node next;
        //created constructor-iska koi return type nhi hota automatic call hota hai
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //property static variable
    public static Node head;
    public static Node tail;
    public static int size;

//fn for adding at first postion
    public void addFirst(int data){
        size++;
        //step1 create new Node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2 newNode next=head;
        newNode.next=head;
        //step3
        head=newNode;
        
    }
    public void addLast(int data){
        //creating new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2
        tail.next=newNode;
        //step3
        tail=newNode;
    }

    //add at anyindex
    public void Add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
          //create newnode
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
        


    }
    public int Removefirst(){
        if(size==0){
            System.out.println("Linklist is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //for rest cases
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("Linklist empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=size-2
    //prev node create kia hu
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        //store kr lia
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int iterativesearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //if key not found
            return -1;
        }

        //recursivr approach
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recursivesearch(int key){
            return helper(head, key);
        }

        public void reverse(){
            Node prev=null;//kuki head ka piche kuch nhi hota 
            Node curr=tail=head;
            Node next;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
    public void print(){
        Node temp=head;
        if(temp==null){
            System.out.println("linklist is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
        }

        public void deleteNthfromEnd(int n){
            //calculate size
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(n==sz){
//if n=size mltb last se total size mtlbb head delte krne bol rha
                head=head.next;
                return;
            }
            //sz-n
            int i=1;
            //jisko hatana hai uske phle wala node
            int itofind=sz-n;
            Node prev=head;//variable for loop
            while(i<itofind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;

        }

        public Node findMid(Node head){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            return slow;
        }
        public boolean checkpalindrome(){
            if(head==null || head.next==null){
                return true;
            }
            //step 1 find middleNode
            Node  midNode=findMid(head);

            //step2 -reverse
            Node prev=null;
            Node curr=midNode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev; //right half ka head
            Node left=head;
            //check left half and right half
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
        }
    public static void main(String args[]){
        AddinLinklist ll=new AddinLinklist();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.Add(2, 9);
        ll.print();
        System.out.println("size:"+ll.size);
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.iterativesearch(2));
        System.out.println(ll.recursivesearch(9));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
        System.out.println(ll.checkpalindrome());
    }
}
