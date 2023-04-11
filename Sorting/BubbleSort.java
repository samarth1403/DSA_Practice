// Bubble Sort 
// We are comparing adjacent elements . If they are not in correct order then we will swap them .
// We require n-1 iterations to sort all elements.
// We have to do comparison for only n-i-1 elements
// Outer loop = 0 to n-2 (i.e < n-1)
// Inner loop = 0 to n-i-2 (i.e < n-i-1)

// Bubble is Stable and In-Place Sort

public class BubbleSort {
    // Method 1 TC = O(n^2) in all cases SC = O(1)
    public static void BubbleSort(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<(arr.length - i - 1); j++){// last i elements are already sorted
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Method 2 - Optimized If our array is already sorted then also the method-1 compares all the elements . So , In this case also the method-1 gives TC=O(n^2)
    // This method is optimized . TC = O(n^2) in worst case . But O(n) in Best Case SC = O(1)

    public static void BubbleSortOptimized(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            boolean flag = false;
            for(int j=0; j<(arr.length - i -1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){// If no any swaps happened then our array is already sorted
                return;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // BubbleSort(arr);
        BubbleSortOptimized(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}