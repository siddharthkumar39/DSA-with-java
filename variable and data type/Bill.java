
import java.util.Scanner;

public class Bill {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        double pencil= sc.nextDouble();
        System.out.println("Enter the price of pen");
        double pen=sc.nextDouble();
        System.out.println("Enter the price of Eraser");
        double eraser=sc.nextDouble();
        double totalcost= pencil+pen+eraser;
        // double gst= (18/100)*(totalcost); still 18%100 is intger divison
        double gst =(18.0/100)*totalcost;
        double bill=totalcost+gst;
        System.out.println(totalcost);
        System.out.println(gst);
        System.out.println(bill);
        
    }
}
