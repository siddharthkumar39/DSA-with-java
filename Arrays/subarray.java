public class subarray{

    public static void printing_subarray(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){ //outer loop first number k lie 
            int start=i;
            for(int j=i;j<numbers.length;j++){
 //yha pr j=i+1;islie nhi lie kuki first number itself solo subarray ho skta hai 
                int end=j;
                for(int k=start;k<=end;k++){
                    //this loop is for printig sub array suru se last tak
                    System.out.print(numbers[k]+" ");
                }
                ts++;
/* jaise hi print hoga count badh jyga*/
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total no of subarray:"+ts);
    }
    public static void main(String args[]) {
        int numbers[]={2,4,6,8,10};
        printing_subarray(numbers);
    }
}
