
import java.util.Scanner;

public class InvertedhalfpyramidNumbers {
    public static void inverted_halfpyramid_with_numbers(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int num =sc.nextInt();
            inverted_halfpyramid_with_numbers(num);
        }
    }
