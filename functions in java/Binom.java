public class Binom {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binocoff(int a,int b){
       int fact_n= fact(a);
        int fact_r=fact(b);
        int fact_nr=fact(a-b);
        int binocoff= (fact_n)/(fact_r * fact_nr);
        return binocoff;
    }
    public static void main(String args[]){
         System.out.println(binocoff(5, 2));
    }
}
