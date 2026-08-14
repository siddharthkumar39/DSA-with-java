public class Trappingrainwater {
    public static int Trappedrainwaterboundary(int height[]){
        //calcualting lef max boundary-array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
      }
      //calculating right max boundary
      int rightMax[]=new int[height.length];
      rightMax[height.length-1]=height[height.length-1];
      for(int i=height.length-2;i>=0;i--){
        //ye last se suru krnge
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
      }
      int trappedrainwater=0;
      //loop
      for(int i=0;i<height.length;i++){
        int waterlevel=Math.min(leftMax[i],rightMax[i]);
        trappedrainwater+=waterlevel-height[i];
      }
      return trappedrainwater;
    }
    public static void main(String argd[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("trapped water is:"+Trappedrainwaterboundary(height));
    }
}
