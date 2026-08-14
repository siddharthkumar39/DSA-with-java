import java.util.Arrays;
import java.util.Collections;
public class decendingorderinbuiltsort {
    
    public static void inbuilt_sort(Integer arr[]){
        //object integer
        Arrays.sort(arr,Collections.reverseOrder());
        // descending order inbuilt sort syntax
    }
    public static void print_array(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[]={3,2,5,4,1};
        inbuilt_sort(arr);
        print_array(arr);
    }
}
