import java.util.*;
public class ValidParenthesis {

    public static boolean isvalid(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){ //opening bracket
                s.push(ch);
            }else{
                //closing 
                if(s.empty()){ // agar  directly closing bracket rha to)}]
                    return false;
                }
                if((s.peek()=='(' && ch==')') //())
                || (s.peek()=='[' && ch==']') //[]
                || (s.peek()=='{' && ch=='}')){  //{}
                    s.pop();// if forming pair pop
            }else{
                return false;
            }
         }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        //or simply instead of condition return s.isEmpty();
    }
    public static void main(String args[]){
        String str="[({})]";
        System.out.println(isvalid(str));
    }
    
}
