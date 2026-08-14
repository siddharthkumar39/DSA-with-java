import java.util.*;
public class Butterfly {
    public static void Butterfly_pattern(int n){
        //first half
        for(int i=1;i<=n;i++){
            //for first stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for after spaces again stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half -sb same rehega bsh outer loop change hoga becz 
        // mirror image rehega
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            //for spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for after spaces again stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            System.out.println("enter no lines want to print");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            Butterfly_pattern(n);
        }
    }

