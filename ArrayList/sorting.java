import java.util.ArrayList;
import java.util.Collections;
public class sorting {

    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(35);
        list.add(17);
        list.add(70);
        list.add(49);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("in descending order");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
