// Selection Sort - In this we will select one element and place it at its correct position .
// We require n-1 iterations to sort all elements.
// We have to find minimum element from i+1 to n-2
// Outer loop = 0 to n-2 (i.e < n-1)
// Inner loop = i+1 to n-1 (i.e < n)

public class SelectionSort {
    public static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            // For finding minimum element in unsorted part of array
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }

            // Placing minimum element at its correct position
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        SelectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}