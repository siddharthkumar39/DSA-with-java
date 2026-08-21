import java.util.ArrayList;
public class StackUsingArrayList {
        static class Stack{
            static ArrayList<Integer> list=new ArrayList<>();
    
            //created function to check wheteher the stack is empty or not
            public static boolean isempty(){
                return list.size()==0;
            }
            //push
            public static void push(int data){
                list.add(data); //inbuilt function arraylist for adding at O(1)
            }
    
            //pop
            public static  int pop(){
                if(isempty()){
                    return -1;
                }
                int top=list.get(list.size()-1);
                list.remove(list.size()-1);//delete at O(1)
                return top;
            }
            //peek
            public static int peek(){ //jhakna top element bash dkeh k return krega
                if(isempty()){
                    return -1;
                }
               return  list.get(list.size()-1);
            }
            }
        public static void main(String args[]){
            Stack s= new Stack();//object creataion
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while(!s.isempty()){
                System.out.println(s.peek());
                s.pop();
            }
            }
        }
