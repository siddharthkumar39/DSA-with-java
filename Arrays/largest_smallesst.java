public class largest_smallesst {
    public static int Large_small(int numbers[]){
        int smallest=Integer.MAX_VALUE; //+infinity
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest is "+smallest);
        return largest; 
//return bsh value ko wha bejhta hai jha se function call hua tha print nhi

        }
    public static void main (String args[]){
        int numbers[]={1,3,8,9,10,99,88};
        System.out.println("largest number is:"+Large_small(numbers));
    }  
}
