import java.util.*;
public class TrappedWater {
    public static int trap(int[] height) {
        
        //Using Auxilary array

        // Maximum Left bar for every bar
        int[] leftMaxArray = new int[height.length];
        leftMaxArray[0] = height[0];
        for(int i=1; i<leftMaxArray.length; i++){
            leftMaxArray[i] = Math.max(height[i] , leftMaxArray[i-1]);
        }

        // Maximum Right bar for every bar
        int[] rightMaxArray = new int[height.length];
        rightMaxArray[rightMaxArray.length - 1] = height[height.length - 1];
        for(int i= rightMaxArray.length - 2; i>=0; i--){
            rightMaxArray[i] = Math.max(height[i] , rightMaxArray[i+1]);
        }

        int trappedWater = 0;
        int widthOfBar = 1;

        for(int i=0; i<height.length; i++){
            int waterLevel = Math.min(leftMaxArray[i] , rightMaxArray[i]);
            trappedWater += (waterLevel - height[i])*widthOfBar;
        }

        return trappedWater;

    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trap(height);
        System.out.println("The trapped water is : " + ans);
    }
}