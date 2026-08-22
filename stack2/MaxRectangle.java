import java.util.*;
public class MaxRectangle {
    public static void Maxarea(int arr[]){
        int max_area=0;
        int nsr[]=new int[arr.length];
        int nsl[]= new int[arr.length];


       
        //next smaller right
        Stack<Integer>s=new Stack<>();
        // same as next greater only < se > hoga
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length; // -1 ke jgh n
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }


        // next smaller left
        s=new Stack<>(); // stack phle se ban hai khali kie isko
        // same as next greater only for loop reverse hoga
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1; // 
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current area: width =j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            max_area=Math.max(currArea,max_area);
        }
        System.out.println("max area of histogram or max rectangle="+max_area);
        }
        public static void main(String args[]){
            int arr[]={2,1,5,6,2,3};
            Maxarea(arr);
    }
    }