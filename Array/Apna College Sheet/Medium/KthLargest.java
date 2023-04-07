import java.util.*;

/*
 * If array is sorted in the Asending order then (array.length - k + 1)th element will be Kth Largest element
 * If array is sorted in the Desending order then kth element will be Kth Largest element
 */

public class KthLargest {

  public static int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums); // Sorted in decsending order 
    // int i = nums.length - 1; // Started travel from end
    // int ans = 0;
    // int count = 0; // To know the 1st / 2nd / 3rd .... elements
    // if (nums.length == 1) { // For an array having only one element
    //   ans = nums[0];
    // } 
    // else {
    //   while (i >= 0) {
    //     if (nums[i] >= nums[i - 1] && count <= k) {
    //       count++;
    //       if (count == k) {
    //         ans = nums[i];
    //         break;
    //       }
    //       i--;
    //     }
    //     if (i == 0) { // If i comes at first element
    //       ans = nums[0];
    //       break;
    //     }
    //   }
    // }
    // return ans;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,3,1,2,4,5,5,6};
    int k = 4;
    int KthLargest = findKthLargest(nums,k);
    System.out.println("The Kth Largest element is : "+KthLargest);
  }
}
