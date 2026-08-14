import java.util.*;
public class linearsearching {
    public static int Linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;//index return krrega
            }
        } //i update hoga ye brace tk flow phchne k bd
        return -1;   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int numbers[]={1,20,30,40,60,80};
        System.out.println("enter key to search");
        int key=sc.nextInt();
        int index=Linearsearch(numbers, key);
        if(index==-1){
            System.out.println("element Not found ");
        }else{
        System.out.println("key is at index:"+index);
    } 
}
}
