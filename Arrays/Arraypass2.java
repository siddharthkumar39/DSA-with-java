public class Arraypass2 {
    public static void update(int marks[] , int nonchangable){
         nonchangable = 100;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main (String args[]){
        int marks[]={98,99,100};
        int nonchangable=50;
        update(marks , nonchangable);
        System.out.println(nonchangable);
        // yah non chnagagble varialbe ka value change 100 nahi 50 hoga kuki call by value h or array me sb value
        // 1 add (99,100,101) ayga kuki array ka address pass by reference hota islie upper fn me change krne se
        // main value change ho gya

        //printmarks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
            // space semicolon k bich do  " "
        }
        System.out.println(); 
    }
    }

