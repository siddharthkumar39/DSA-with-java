public class selectionsort {
    public static void selection_sort(int arr[]){
        //outer loop no of terns
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){ // for decending order change the >
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i]; //i index ke lie nikl rhe islie 
            arr[i]=temp;
        }
    }
    public static void print_sortedarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,1,5,4};
        selection_sort(arr);
    print_sortedarray(arr);
}
}
