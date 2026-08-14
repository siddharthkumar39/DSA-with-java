
import java.util.Scanner;

public class Upperhalftriangle{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("how many line/row you want to print");
        int n=sc.nextInt();
        for(int row =1;row<=n;row++){
        for(int col=1;col<=n;col++){
            if(row+col<=n+1){
                System.out.print("*");
            }else{
                System.out.print("_");
            }
        }
        System.out.println();
    }
}
}
// yha main logic ye hai ki diganoally wise stars ka row+col ko add kro to jiska sum<=n+1;
//whi tk stars print ho rha hai