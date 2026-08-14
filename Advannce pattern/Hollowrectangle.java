public class Hollowrectangle {
    public static void Hollow_rect(int row,int col){
        //for row-outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j=1;j<=col;j++){
                //boundary condition hai 
                if(i==1 || i==row||j==1|| j==col){
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
        Hollow_rect(4, 5);
    }
}
