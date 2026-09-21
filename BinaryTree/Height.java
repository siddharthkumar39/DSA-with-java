
public class Height {
    static class Node{
        int data;
        Node left,right;
    public  Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public static int height(Node root){
    if(root==null){
        return 0 ;
    }
    int lh=height(root.left);
    int rh=height(root.right);
    return Math.max(lh,rh)+1;
}

//count of node
public static int count(Node root){
    if(root==null){
        return 0;
    }
    int leftcount=count(root.left);
    int rightcount=count(root.right);
    return leftcount+rightcount+1;
}

//sumof nodes
public static int sum(Node root){
    if(root==null){
        return 0;
    }
    int leftsum=sum(root.left);
    int rightsum=sum(root.right);
    return leftsum+rightsum+root.data;
}
public static void main(String args[]){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    //height
    System.out.println(height(root));

    // no of nodes
    System.out.println(count(root));

    //sum
    System.out.println(sum(root));
}
}
