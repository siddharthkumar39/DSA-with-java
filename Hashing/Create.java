import java.util.*;
public class Create{
    public static void main(String args[]){
        //create
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",50);
        hm.put("us",25);
        System.out.println(hm);

        //get-O(1)
        int population=hm.get("india");
        System.out.println(population);
        System.out.println(hm.get("israil"));//null becz israil key me nhi hai

        //contains
        System.out.println(hm.containsKey("india"));

        //remove 
        hm.remove("china");
        System.out.println(hm);
    }

}