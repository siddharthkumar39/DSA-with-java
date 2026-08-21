import java.util.*;
public class pushatBottom {
    public static void bottompush(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        //funcation call recursive
        bottompush(s,data);
        //waps ate smy backtrack
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        bottompush(s, 4);
        //for verifying
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }  
}
