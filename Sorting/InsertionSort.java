// In this , we will pick one element from unsorted array and iterate through sorted array and find its correct position by comparing and swaping

public class InsertionSort {

  public static void InsertionSortStandardCode(int[] arr){// TC = O(n) in Best Case
    //TC = O(n^2) in worst case
    for(int i=1; i<arr.length; i++){
      int j=i;
      while(j>0 && arr[j]<arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
      
    }
  }

  public static void main(String args[]) {
    int[] arr = {5,4,3,2,1};
    InsertionSortStandardCode(arr);
    for (int i : arr) {
        System.out.print(i + " ");
      }
  }
}
