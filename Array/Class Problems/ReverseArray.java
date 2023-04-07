public class ReverseArray {
    public static void main(String[] args) {
        int[] a1 = {11,12,13,14,15};

        //Method 1 Brute Force Method
        // Create a new array and add elements from last . But here TC = O(n) and SC = O(n)
        // int[] a2 = new int[a1.length];
        // int j = 0;
        // for(int i=a1.length - 1; i >= 0; i--){
        //     if(j < a2.length){
        //         a2[j] = a1[i];
        //         j++;
        //     } 
        // }

        // for(int i=0; i<a2.length; i++){
        //     System.out.print(a2[i] + " ");
        // }

        // Method 2 : Optimized way : Swapping first and last value
      
        int i = 0;
        int j = a1.length - 1;
        int temp;
        while(i<j){
            temp = a1[i];
            a1[i] = a1[j];
            a1[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<a1.length; k++){
            System.out.print(a1[k] + " ");
        }

    }
}