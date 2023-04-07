import java.util.*;
public class BinarySearch {
    /*
     * For Binary Search
     * Prerequisits
     * 1. Array must be either in asending or desending order
     */
    public static void main(String[] args) {
         int[] a1 = {11,12,13,14,15};
         //find index of 14 using binary search
         int start = 0;
         int end = a1.length - 1;
         
         while(start <= end){
            int mid = start + (end - start)/2;
            if(a1[mid] == 14){
                System.out.println("The element is found at index : " + mid);
                break;
            }
            else if(a1[mid] > 14){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
         }
    }
}