
import java.util.Scanner;

public class Palindrome {
    public static void check_palindrome(int num){
        int reversed_no=0;
        int original_num=num;
        while(num>0){
            int lastdigit =num%10;
            reversed_no=(reversed_no*10)+lastdigit;
            num=num/10;
        }
            if(reversed_no==original_num){
                System.out.println("Its a Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }
            public static void main (String args[]){
                Scanner sc= new Scanner(System.in);
                int a=sc.nextInt();
                check_palindrome(a);
    }
}
