import java.util.Scanner;

public class counterpyramid {
    public static void counter_num_pyramid(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no line want to print");
        int n=sc.nextInt();
        counter_num_pyramid(n);
    }
}
