public class Maxsubarray4 {
    public static void subarray_max(int num[]){
        int currentsum=0;
        int Maxsum=Integer.MIN_VALUE;//-infinity
        int prefix[]=new int[num.length];
        prefix[0]=num[0];//first sub array ka sum first index no itself hoga
        //calculate prefix
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end =j;
                 currentsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
//lekin yaha pr start 0 se start hai then agr 0 hua then 0-1=-1 invalid hoga islie
// we will use ternary operator agr 0 hua to bina minus kie direct use kr lnge
                     System.out.println(currentsum);
                    if(currentsum>Maxsum){
                        Maxsum=currentsum;
                    }
                }
            }
            System.out.println("Maxsum"+Maxsum);

    }
    public static void main(String argss[]){
        int num[]={1,-2,6,-1,3};
        subarray_max(num);
    }  
}