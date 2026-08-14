import java.util.*;
public class diamond {
    public static void diamond_pattern(int n){
        for(int i=1;i<=n;i++){ //outer loop for first half
         for(int j=1;j<=n-i;j++){//for spaces
            System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
            //for second half -mirror image
            for(int i=n;i>=1;i--){ //outer loop
          for(int j=1;j<=n-i;j++){ //for spaces
            System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
        public static void main(String args[]){
            System.out.println("enter no of lines want to  print");
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            diamond_pattern(n);
        }
    }
