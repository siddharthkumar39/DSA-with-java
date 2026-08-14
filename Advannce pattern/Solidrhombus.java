import java.util.*;
public class Solidrhombus {
    public static void Solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Enter no lines to print");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solid_rhombus(n);
    }
}
