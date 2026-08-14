import java.util.ArrayList;
public class CreatingArrayList{
    public static void main(String args[]){
ArrayList<Integer>list1=new ArrayList<>();
ArrayList<String>List2=new ArrayList<>();
ArrayList<Boolean>List3=new ArrayList<>();
//add operation -O(1)
list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
System.out.println(list1);

// adding at index O(n)
list1.add(1,55);
System.out.println(list1);

//Get operation O(1)
int element=list1.get(2);
System.out.println(element);

//delte operation-0(n)
list1.remove(3);
System.out.println(list1);

 //set element at index O(n)
 list1.set(1,10);
 System.out.println(list1);

 //conatins elements O(n)
 System.out.println(list1.contains(1));
 System.out.println(list1.contains(100));
    }
}




