import java.util.Scanner;

public class upperighttraingle{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row-col<=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
