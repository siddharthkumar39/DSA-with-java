import java.util.ArrayList;
public class PrintingMax {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(25);
        list.add(50);
        list.add(70);
        list.add(90);
        System.out.println(list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
                System.out.println("max no.:"+max);
            

    }
    
}
