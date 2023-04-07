public class SortedRotatedSearch {

        public static int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
    
            while(start <= end){
                int mid = (start + end)/2;
    
                if(nums[mid] == target){
                    return mid;
                }
    
                else if(nums[start] <= nums[mid]){ // means the left part of the array is sorted
                    if(target <= nums[mid] && target >= nums[start]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
    
                else { // means the right part of the array is sorted
                     if(target <= nums[end] && target >= nums[mid]){
                         start = mid + 1;
                     }
                     else {
                         end = mid - 1;
                     }
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2,3};
        int ans = search(nums , 0);
        System.out.println("The index is : " + ans);
    }
}