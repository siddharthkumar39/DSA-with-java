public class bubblesort {
    public static void bubble_sort(int arr[]){
        //jitna element use ek kam comparison hota hai
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                    //swap
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
        }
    }
    //for printing
    public static void print_sortedarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubble_sort(arr);
        print_sortedarray(arr);
}
}
