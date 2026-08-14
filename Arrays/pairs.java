public  class pairs {
    public static void Printing_pairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
           int current=numbers[i];
           for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+current+","+numbers[j]+")");
            tp++;
/*har bar jab do no print ho rha to 1 pair print ho rha hai
 islie tpp++ just print statement k bad likhe hai */
           }
           System.out.println();
        }
        System.out.println("total pairs="+tp);
    }
        
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        Printing_pairs(numbers);
}
}
