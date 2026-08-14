public class insertionsort{
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //findingout the correct place to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserting
            arr[prev+1]=curr;
        }
    }
    public static void print_sortedarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,1,4,5};
        insertion_sort(arr);
        print_sortedarray(arr);
    }
}
