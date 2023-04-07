import java.util.*;
class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        // Method 1 : Brute force method using two loops ( TC = O(N^2))

        //Method 2 : By sorting the array 
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
             if(nums[i] == nums[i-1]){
                    return true;
                } 
        }
        return false;

        // Method 3 : By using the concept of Hashtable
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}