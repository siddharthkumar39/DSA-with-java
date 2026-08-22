import java.util.*;
public class DuplicateParenthesis {
    

    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); // ek ek character ko taverse

            //closing condition check

            if(ch==')'){
                int count =0;
                while(s.peek() !='('){ //jab tak opening bracket na mile
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop(); // opening pair jo hai current ka usko hatayga
                }
            }
            else{
                // baki ko push kro ;opening condition
                s.push(ch);
            }
        }
        return false;
    }
        public static void main(String args[]){
            String str="((a+b))"; //true 
            String str2="(a-b)"; //false
            System.out.println(isDuplicate(str));
            System.out.println(isDuplicate(str2));

}
}
