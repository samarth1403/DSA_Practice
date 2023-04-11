// Move all 0 to the end of the array without changing order of all other non-zero elements . 
// Input - {0,1,10,5,0,4};
// Output - {1 10 5 4 0 0 }
public class Problem1 {
    public static void MoveAllZerosToEnd(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean flag = false;
            for(int j=0; j<(arr.length - i - 1); j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {0,1,10,5,0,4};
        MoveAllZerosToEnd(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}