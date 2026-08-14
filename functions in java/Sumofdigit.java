
import java.util.Scanner;

public class Sumofdigit {
    public static int sum_Digit(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;//jisme return type ho usme return reuired hai jo answer chie wo return kro
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println("sum of digit:"+sum_Digit(a));
        }
    }
