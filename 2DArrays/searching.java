public class searching {

    public static Boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+","+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,38},{32,33,39,50}};
        int key=35;
        search(matrix, key);
    }
}

