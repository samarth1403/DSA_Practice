import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        
        // We are using the concept of auxilary arrays (Helper Arrays)

        // Left max array : we will calculate max left height for each element 
        int[] leftMaxArr = new int[height.length];
        leftMaxArr[0] = height[0];
        for(int i=1; i<leftMaxArr.length; i++){
            leftMaxArr[i] = Math.max(height[i] , leftMaxArr[i-1]);
        }

        //Right max array : we will calculate max right height for each element
        int[] rightMaxArr = new int[height.length];
        rightMaxArr[rightMaxArr.length - 1] = height[height.length - 1];
        for(int i=rightMaxArr.length-2; i>=0; i--){
            rightMaxArr[i] = Math.max(height[i] , rightMaxArr[i+1]);
        }
        
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
           int waterlevel = Math.min(leftMaxArr[i],rightMaxArr[i]);
           trappedWater += (waterlevel - height[i])*1;
        }
        System.out.println("The amount of rainwater trapped is : "+trappedWater);
    }
}