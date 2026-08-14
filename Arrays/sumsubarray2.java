public class sumsubarray2 {
    public static void sumsubaary_2(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
//yha islie declare kr rhe taki har i k lie reset ho or j me 
// use kre bina k loop use kie jise O(n2) ho O(n3) ke jgh
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
        }
        System.out.println("maximum sum:"+max);
        System.out.println("minimum sum"+min);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        sumsubaary_2(arr);
    }
}
    

