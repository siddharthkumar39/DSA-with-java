
import java.util.Scanner;

public class Zero_onetriangle {
    public static void Zero_and_one_traingle(int n){
        for(int i=1;i<=n;i++){     //row
            for(int j=1;j<=i;j++){ //col
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            System.out.println("Enter no lines want to print");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            Zero_and_one_traingle(n);
        }
    }
