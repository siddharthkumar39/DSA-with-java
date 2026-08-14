import java.util.ArrayList;
public class Swap {
    public  static  void SWAPPPING(ArrayList<Integer> list,int indx1,int indx2){
        int temp=list.get(indx2);
        list.set(indx2,indx1);
        list.set(indx1,temp);
        System.out.println(list);
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int indx1=1;
        int indx2=3;
        SWAPPPING(list, indx1, indx2);
    }
    
}
