import java.util.Arrays;
public class inbuiltsort2 {
    
    public static void inbuilt_sort(int arr[]){
        Arrays.sort(arr,0,2);
        // partcular index tk agar sort krna ho
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,5,4,1};
        inbuilt_sort(arr);
        print_array(arr);
    }
}
