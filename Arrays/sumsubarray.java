public class sumsubarray {
    public static void subarraysum(int arr[]){
        int total_sbarray=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0; 
//islie  sum ko j loop me declare kr rhe hai  kuki har sub array k lie reset hoga
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                total_sbarray++;
                System.out.println();
                 if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
            System.out.println();
        }
        System.out.println("total no of subarray:"+total_sbarray);
        System.out.println("max sum:"+max);
        System.out.println("minimum sum:"+min);
    }
    public static void main (String args[]){
        int arr[]={2,4,6,8,10};
        subarraysum(arr);
    }
}
