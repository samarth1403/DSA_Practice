public class MaxSubarraySum {
    public static void main(String[] args) {
        // Using kadane's algorithm
        int[] nums = {-2,-1};
        int maxsum = 0;
        int currsum = 0;
        int min = nums[0];
        boolean allNegative = true; // Checking whether all numbers are negative (Exception case in kadane's algorithm)
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                allNegative = false;
            }
            if(allNegative == false){
                currsum += nums[i];
                if(currsum < 0){
                currsum = 0;
                 }
                if(currsum > maxsum){
                maxsum = currsum ;
                 }
            }
            else{
                if(nums[i] > min){
                    min = nums[i];
                }
                maxsum = min;
            }    
        }
        System.out.println("The maximum sum is : " + maxsum);

    }
}