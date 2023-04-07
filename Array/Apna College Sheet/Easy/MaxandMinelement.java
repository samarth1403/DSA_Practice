public class MaxandMinelement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum element in the array : "+max);
        System.out.println("The minimum element in the array : "+min);
    }
}