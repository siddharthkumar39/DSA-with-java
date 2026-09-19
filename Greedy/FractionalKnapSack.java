import java.util.*;

public class FractionalKnapSack {
    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=  (double) value[i] / weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        //sorted in ascending order but we need in descending order
        int capacity=W;
        int finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                //include full items
                finalvalue+=value[idx];
                capacity-=weight[idx];
            }else{
                //include partial item
                finalvalue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("finalvalue="+finalvalue);
    }
}