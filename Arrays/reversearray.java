public class reversearray {
    public static void reverse(int numbers_arr[]){
        int start=0;int last=numbers_arr.length-1;
        // aise reverse karne se time complexity  O(1) rhta hai 
        while(start<last){
            //swapping
            int  temp=numbers_arr[last];
            numbers_arr[last]=numbers_arr[start];
            numbers_arr[start]=temp;

        start++;
        last--;
        }
    }
    public static void main(String args[]){
        int numbers_arr[]={29,49,48,93,26,27};
        for(int i=0;i<numbers_arr.length;i++){
            System.out.print(numbers_arr[i]+" ");
        }
        System.out.println();
        reverse(numbers_arr);
        for(int i=0;i<numbers_arr.length;i++){
        System.out.print(numbers_arr[i]+" ");
    }
}
}
