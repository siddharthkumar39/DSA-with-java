import java.util.Scanner;
public class Leapyear {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your preffered year to check");
        int year= sc.nextInt();
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("its a leap year");
        }else{
            System.out.println("not a leap year");
        }   
    }
}
