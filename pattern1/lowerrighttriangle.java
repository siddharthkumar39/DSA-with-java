
import java.util.Scanner;

public class lowerrighttriangle {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no lines to print");
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row+col>n){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }   
    }
}
// yaha ka conditon ye hai ki sum of row+col>n jha whi whi stars hamare print ho rahe hai
