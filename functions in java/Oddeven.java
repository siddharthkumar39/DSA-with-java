
import java.util.Scanner;


public class Oddeven {
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();

        System.out.println(isEven(a));
    }
}
