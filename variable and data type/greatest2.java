import java.util.Scanner;

public class greatest2 {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if (a>b&& a>c){
            System.out.println(a+ "is largest");
        }
        else if(b>c){
            System.out.println(b+ "is largest");
        }else{ 
//jha p semicolon a gya mtlb wo line whi khtm ho gya hai next line ham uske just bgl se start 
// kr sktwe hai
            System.out.println(c+"is largest");
        }
    }
}
