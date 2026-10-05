import java.util.*;
public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert (Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
        //inorder for checking
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }


        //search in BST
        public static boolean Search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return Search(root.left,key);
            }
            else{
                return Search(root.right,key);
            }
        }

        //node deletion
        public static Node delete(Node root,int val){
            if(root.data<val){
                root.right=delete(root.right,val);
            }
            else if(root.data>val){
                root.left=delete(root.left,val);
            }
            else{ //delete curr node
                //case1-leaf Node
                if(root.left==null && root.right==null){
                    return null;
                }
                //single child node delte
                if(root.left==null){
                    return root.right;
                }else if(root.right==null){
                    return root.left;
                }
                //case 3 delete which have both the child
                Node IS=FindInorderSuccesor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
            }
            return root;
        }
        public static Node FindInorderSuccesor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        //printinRange
        public static void printINRange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
                printINRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printINRange(root.right, k1, k2);
            }else if(root.data<k1){
                printINRange(root.right, k1, k2);
            }else{
                printINRange(root.left, k1, k2);
            }
        }
        //root to leaf path
        public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
            if(root==null){
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null){
                PrintPath(path);
            }
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
            path.remove(path.size()-1);
        }
        public static void PrintPath(ArrayList<Integer>path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println("Null");
        }

        //isvalid bst
        public static boolean isValidBST(Node root,Node min,Node max){
            if(root==null){
                return true;
            }

            if(min!=null && root.data<=min.data){
                return false;
            }else if(max!=null && root.data>=max.data){
                return false;
            }
            return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
        }











        public static void main(String args[]){
            int val[]={5,1,3,4,2,7};
            Node root=null;
            for(int i=0;i<val.length;i++){
                root=insert(root,val[i]);
            }
            inorder(root);
            System.out.println();

            //search
            if(Search(root, 1)){
                System.out.println("found");
            }
        else{
            System.out.println("not found");
        }

        //deletion
        root=delete(root,1);
        System.out.println();
        inorder(root);

        //printin range
        System.out.println();
       printINRange(root, 5, 6);
       System.out.println();

       // print root to leaf
       ArrayList<Integer> path = new ArrayList<>();
       printRoot2Leaf(root, path);
       System.out.println();

       //isvalid bst
       if(isValidBST(root, null, null)){
        System.out.println("valid");
       }
       else{
        System.out.println("Not valid");
       }
    }  
} 
