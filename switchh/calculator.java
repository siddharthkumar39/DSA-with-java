import java.util.Scanner;
public class calculator {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter operator want to perform");
        char operator=sc.next().charAt(0);//first index lega
        switch(operator){
            case '+': System.out.println(a+b);
                break;
                case '-':System.out.println(a-b);
                break;
                case '*':System.out.println(a*b);
                break;
                case '/':System.out.println(a/b);
                default:System.out.println("invalid operator");

        }

    }
}
