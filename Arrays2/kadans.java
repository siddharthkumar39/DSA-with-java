//maxmimum subarray using kadans algorithm
public class kadans {
    public static void kadanes(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<numbers.length;i++){
            currentsum+=numbers[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);
        }
        System.out.println("maximum subbarray sum is:"+maxsum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }  
}
