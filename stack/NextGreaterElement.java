import java.util.*;
public class NextGreaterElement {
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nxtGreator[]=new int[arr.length];

        //travelling from back
        for(int i=arr.length-1;i>=0;i--){
            //while
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                //s.peek hamko top ka index deta hai arr[index]=no
                s.pop();
            }
            //if-else
                if(s.empty()){
                    nxtGreator[i]=-1;
                }else{
                    nxtGreator[i]=arr[s.peek()];
                }
                //push in s
                s.push(i);
        }
        for(int i=0;i<nxtGreator.length;i++){
            System.out.print(nxtGreator[i]+" ");
        }

    }
}