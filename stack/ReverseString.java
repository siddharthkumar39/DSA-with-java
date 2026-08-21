import java.util.*;
public class ReverseString {
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
    

    public static String reverseString(String str){
        Stack<Character> s=new Stack<>(); //stack  using java collection framework
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        //resultant string 
        StringBuilder result=new StringBuilder("");
        while(!s.empty()){
            char curr=s.pop();
            result.append(curr);//last me jodna last m add
        }
        return result.toString();
        //result.to string string builder ko string me convert krke return krne k lie
    }
        public static void main(String args[]){
         String str="abc";
           String result= reverseString(str);
           System.out.println(result);
    }
}

