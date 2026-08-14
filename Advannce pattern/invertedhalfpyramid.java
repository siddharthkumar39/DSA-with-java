public class invertedhalfpyramid {
    public static void Rotated_inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            //for spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Rotated_inverted_half_pyramid(4);
    }
}
//logic yaha ye hai ki spaces har ek row me n-i times hai and stars=row hai in every row;