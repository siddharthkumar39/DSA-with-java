
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left;Node right;
        //constructor
         public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }

            //diameter calculation
            public static int diameter(Node root){
                
                //base case
                if(root==null){
                    return 0;
                }
                int leftDiam=diameter(root.left);
                int leftHeight=height(root.left);
                int rightDiam=diameter(root.right);
                int rightHeight=height(root.right);

                int SelfDiam=leftHeight+rightHeight+1;
                return Math.max(SelfDiam,Math.max(leftDiam,rightDiam));
            }

            //diameter calcultion  2nd approach O(n)
            static class Info{
                int diam;
                int ht;

                public Info(int diam,int ht){
                    this.diam=diam;
                    this.ht=ht;
                }
            }

            public static Info diameter2(Node root){

                //base case
                if(root==null){
                return new Info(0,0);
            }
            //recursion 
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

            //diameter calculation
            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            
            // height calcylation 

            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(diam,ht);
            }

            //is identical

            public static boolean isIdentical(Node node,Node subRoot){
                
                //when both are null
                if(node==null && subRoot==null){
                    return true;
                }
                // one is null and other is not
                else if(node==null || subRoot==null){
                    return false;
                }

                //data different
                if(node.data!=subRoot.data){
                    return false;
                }
                //checking left subtree
                if(!isIdentical(node.left,subRoot.left)){
                    return false;
                }
                //check right subtree
                if (!isIdentical(node.right, subRoot.right)){
                    return false;
                }
                return true;
            }

            public static boolean isSubtree(Node root, Node subroot){
                
                //if main tree becomes empty
                if(root==null){
                    return false;
                }
                //if current node data matches
                if(root.data==subroot.data){
                    //check whether complete subtree is identical
                    if(isIdentical(root, subroot)){
                        return true;
                    }
                }

                //search in left subtree
                if(isSubtree(root.left, subroot)){
                    return true ;
                }
                // search in right subtree 
                return isSubtree(root.right, subroot);
            }
            //top view
            static class Information{
                Node node;
                int hd;
            public Information(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
            }
            public static void topview(Node root){
                if(root==null){
                    return;
                }
                //level order queue
                Queue<Information>q=new LinkedList<>();
                //Hashmap:horizontal distance->node
                HashMap<Integer,Node>map= new HashMap<>();

                int min=0;
                int max=0;
                q.add(new Information(root,0));
                while(!q.isEmpty()){
                    Information curr =q.remove();

                    //first node at horizontal distance
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd,curr.node);
                    }

                    //left child
                    if(curr.node.left!=null){
                        q.add(new Information(curr.node.left,curr.hd-1));
                        min=Math.min(min,curr.hd-1);
                    }

                    if(curr.node.right!=null){
                     q.add(new Information (curr.node.right,curr.hd+1));
                     max=Math.max(max,curr.hd+1);
                    }
                    }
                for(int i=min;i<=max;i++){
                    System.out.print(map.get(i).data+ " ");
                }
            }

            //kth level
            public static void kLevel(Node root,int level,int k){
                if(root==null){
                    return;
                }
                if(level==k){
                    System.out.println(root.data+" ");
                    return;
                }
                kLevel(root.left,level+1,k);
                kLevel(root.right,level+1,k);
            }

            //lowest common ancesstor
            public static boolean getpath(Node root,int n, ArrayList<Node>path){
                if(root==null){
                    return false;
                }
                path.add(root);
                if(root.data==n){
                    return true;
                }
                boolean foundLeft=getpath(root.left, n, path);
                boolean foundRight=getpath(root.right, n, path);
                if(foundLeft || foundRight){
                    return true;
                }
                path.remove(path.size()-1);
                return false;
            }
            public static Node lca(Node root,int n1,int n2){
                ArrayList<Node>path1= new ArrayList<>();
                ArrayList<Node>path2=new ArrayList<>();

                getpath(root, n1, path1);
                getpath(root, n2, path2);


                //last common anceestor
                int i=0;
                for(; i<path1.size() && i<path2.size();i++){
                    if(path1.get(i)!=path2.get(i)){
                        break;
                    }
                }
                //last equal node i=1th
                Node lca=path1.get(i-1);
                return lca;
            }

            //lowsest anceesstor approach 2 -subtree method
            public static Node lca2(Node root,int n1, int n2){
                if(root==null || root.data==n1||root.data==n2){
                    return root;
                }

                Node leftlca=lca2(root.left,n1,n2);
                Node Rightlca=lca2(root.right,n1,n2);

                //left lca=val rightlca=null

                if(Rightlca==null){
                    return leftlca;
                }
                if(leftlca==null){
                    return Rightlca;
                }
                return root;
            }

            //minimum distance between node
            public static int lcaDist(Node root,int n){
                if(root==null){
                    return -1;
                }
                if(root.data==n){
                    return 0;
                }

                int leftDist=lcaDist(root.left, n);
                int rightDist=lcaDist(root.right, n);

                if(leftDist==-1 && rightDist==-1){
                    return -1;
                }else if(leftDist==-1){
                    return rightDist+1;
                }else{
                    return leftDist+1;
                }
            }

                public static int minDist(Node root,int n1,int n2){
                    Node lca=lca2(root,n1,n2);
                    int dist1=lcaDist(lca,n1);
                    int  dist2=lcaDist(lca,n2);
                    return dist1+dist2;

                }
                //kth ancesstor
                public static int KAncestor(Node root,int n, int k){
                    if(root==null){
                        return -1;
                    }
                    if(root.data==n){
                        return 0;
                    }
                    int leftDist=KAncestor(root.left, n, k);
                    int rightDist=KAncestor(root.right, n, k);

                    if(leftDist==-1 && rightDist==-1){
                        return -1;
                    }
                    int max=Math.max(leftDist,rightDist);

                    if(max+1==k){
                        System.out.println(root.data);
                    }

                    return max+1;
                }

                //sum
                public static int  transform(Node root){
                    //base case 
                    if(root==null){
                        return 0;
                    }
                  
                    //original child vlaues
                    int newLeft=root.left==null?0:root.left.data;
                    int newRight=root.right==null?0:root.right.data;

                    //store original root value/data
                    int data=root.data;
                   
                    //recursion
                     int leftchild= transform(root.left);
                    int rightchild=transform(root.right);

                   
                    root.data=newLeft+leftchild+newRight+rightchild;
                    return data;
                }

                public static void preorder(Node root){
                    if(root==null){
                        return;
                    }
                    System.out.print(root.data+" ");
                    preorder(root.left);
                    preorder(root.right);
                }

            public static void main(String args[]){
                Node root=new Node(1);
                root.left=new Node(2);
                root.right=new Node(3);
                root.left.left=new Node(4);
                root.left.right=new Node(5);
                root.right.left=new Node(6);
                root.right.right=new Node(7);


              Node subroot = new Node(2);
              subroot.left = new Node(4);
              subroot.right = new Node(5);

                //printing diameter
            System.out.println("Diameter = " + diameter(root));

            //printing daimeter second approach
            System.out.println(diameter2(root).diam);
            System.out.println(diameter2(root).ht);

            //is Identical problem
            System.out.println(isSubtree(root, subroot));

            //top view root 
            topview(root);

            //k level
            int k=2;
            kLevel(root,1,k);

            //lca
            int n1=4,n2=5;
            System.out.println(lca(root,n1,n2).data);

            //lca2
            System.out.println(lca2(root, n1, n2).data);

            //minimum distance
            System.out.println(minDist(subroot, n1, n2));

            //kancesstor
            KAncestor(root, n2, k);

            //sum
                transform(root);
                preorder(root);


            }
        }
    
