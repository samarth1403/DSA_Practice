public class ProdExceptSelf {
    // public static int[] productExceptSelf(int[] nums) { // Brute Force Method TC = O(n^2)
    //     int[] answer = new int[nums.length];
    //     for(int i=0; i<nums.length; i++){
    //         int product = 1;
    //         for(int j=0; j<nums.length; j++){
    //             if(j==i){
    //                 continue;
    //             }
    //             product *= nums[j];
    //         }
    //         answer[i] = product;
    //     }
    //     return answer;
    // }

    public static int[] productExceptSelf(int[] nums){
        // Array for Left elements Multiplication
        int[] leftProdArr = new int[nums.length];

        // Array for Right elements Multiplication
        int[] rightProdArr = new int[nums.length];

        // Output Array
        int[] outputArr = new int[nums.length];
        
        // LeftProductArray
        leftProdArr[0] = 1;
        for(int i=1; i<leftProdArr.length; i++){
            leftProdArr[i] = leftProdArr[i-1]*nums[i-1];
        }

        // RightproductArray
        rightProdArr[rightProdArr.length - 1] = 1;
        for(int i=nums.length - 2; i>=0; i--){
            rightProdArr[i] = rightProdArr[i+1]*nums[i+1];
        }

        // Final Output Array
        for(int i=0; i<outputArr.length; i++){
            outputArr[i] = leftProdArr[i]*rightProdArr[i];
        }

        return outputArr;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
     }
}