import java.util.*;
public class Arrayscc1 {
    public static void main (String args[]){
        int marks[]= new int[50];
        //declared array
        Scanner sc=new Scanner(System.in);
        //int phy;
        //phy=sc.nextInt(); this we write normally
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("length of array= "+marks.length);
        System.out.println("phy: " +marks[0]);
        System.out.println("math: " +marks[1]);
        System.out.println("chemistry: " +marks[2]);
        marks[2]=marks[2]-20;
       System.out.println("chemistry: " +marks[2]);
       // we can change the value in array means we can directly change or we can do plus minus
       int percent=(marks[0]+marks[1]+marks[2])/3;
       System.out.println("percentage= " +percent+"%");
}
}