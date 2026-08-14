
import java.util.Scanner;

public class Average {
    public static int averag(int a,int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int calcul_avg=averag(num1,num2,num3);
        System.out.println(calcul_avg);
    }  
}
