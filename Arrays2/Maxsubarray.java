public class Maxsubarray {
    public static void subarray_max(int num[]){
        int Maxsum=Integer.MIN_VALUE;//-infinity
        int currentsum=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end =j;
                 currentsum=0;
                for(int k=start;k<=end;k++){
                    currentsum+=num[k];
                    }
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
