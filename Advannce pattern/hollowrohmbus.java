import java.util.*;
public class hollowrohmbus {
        public static void hollow_rhombus(int row,int col){
            for(int i=1;i<=row;i++){
                for(int j=1;j<=(row-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=col;j++){
                    if(j==1||j==col||i==1||i==row){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            System.out.println("enter no of lines to print");
            Scanner sc= new Scanner(System.in);
            int row=sc.nextInt();
            System.out.println("enter no col want to print");
            int col=sc.nextInt();
            hollow_rhombus(row, col);
        }
    }
