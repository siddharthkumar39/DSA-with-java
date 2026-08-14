import java.util.ArrayList;
public class Twodimensional {
    public static void main(String args[]){
    ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
    ArrayList<Integer>list=new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    list.add(1);
    list.add(2);
    list1.add(3);
    list1.add(4);
    mainlist.add(list);
    mainlist.add(list1);

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer>currentlist=mainlist.get(i);
        for(int j=0;j<currentlist.size();j++){
            System.out.print(currentlist.get(j)+" ");
        }
        System.out.println();
    }
    System.out.println(mainlist);
    }
    }
