import java.util.*;
public class hollowrhombus_singlevariable {
    public static void hollow_singlevar_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||j==1||j==n||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("no of lines want to print");
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        hollow_singlevar_rhombus(n);   
    }
}
