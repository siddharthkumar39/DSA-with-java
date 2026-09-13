import java.util.*;
public class Stream {
public static void printNonrepeatig(String str){

    int freq[]=new int[26]; //frequency array
    Queue<Character>q=new LinkedList<>();

    for(int i=0;i<str.length();i++ ){
        char ch= str.charAt(i);
        q.add(ch);
        freq[ch-'a']++;  
//character ko array index me convert krta hai eg-ch=a then freq[97-97]=freq[o]index and ++ mtlb agar do bar exist kia a to 1+1 mtlb freq[0]=2

        while(!q.isEmpty() && freq[q.peek()-'a']>1){
//queue ke front element ki frequency check krnge eg- suppose front element ='a' means freq['a'-'a']=freq[0] check krega
            q.remove();
    }
    if(q.isEmpty()){
        System.out.print(-1+" ");
    }else{
        System.out.print(q.peek()+" ");
    }
}
System.out.println();
}
public static void main(String args[]){
    String str = "aabccxb";
    printNonrepeatig(str);
}
}