public class binarysearching { 
    public static int binarysearch(int numbers_arr[],int key){
        int start=0;int end=numbers_arr.length-1;
        while(start<=end){
             int mid=(start+end)/2;
            if(key==numbers_arr[mid]){
                return mid;
            }
            if(numbers_arr[mid]<key){
                start=mid+1;
//kuki mid tk or uske piche sare elements chote honge islie left/star=mid+1
            }else{
                end=mid-1;
/*  yha key mid se chota hai mtlb,mid se last tk sare element bde honge islie
 right/end=mid-1      */
            }
        }
        return -1;
        }
        public static void main(String args[]){
            int numbers_arr[]={38,39,40,41,42,43}; 
            int key=39;
            //array must be sorted in binary search
            System.out.println("key found at index"+binarysearch(numbers_arr, key));
        }    
}
