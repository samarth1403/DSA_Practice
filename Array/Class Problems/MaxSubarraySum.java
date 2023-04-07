public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int largest = Integer.MIN_VALUE;

        //Method 1 : Brute force Method TC = O(n^3)

        // for(int i=0; i<a1.length; i++){
        //     int start = i;
        //     for(int j=i; j<a1.length; j++){
        //         int end = j;
        //         int sum = 0 ;
        //         for(int k=start; k<=end; k++){
        //             sum = sum + a1[k];
        //             if(sum > largest){
        //                 largest = sum;
        //             }
        //         }
        //     }
        // }
        // System.out.println("the sum of subarray : " + largest);

        // Method 2 : Using Prefix array TC = O(n^2)
        // int[] prefixarr = new int[a1.length];
        // int currsum = 0;
        // int maxsum = Integer.MIN_VALUE;

        // prefixarr[0] = a1[0];
        // for(int i=1; i<a1.length; i++){
        //     for(int j=0; j<=i; j++){
        //         prefixarr[i] += a1[j];
        //     }
        // }
        
        // // Calculation of Max sum subarray
        // for(int i=0; i<a1.length; i++){
        //     int start = i;
        //     for(int j=i; j<a1.length; j++){
        //         int end = j;
        //         currsum = start == 0 ? prefixarr[end] : prefixarr[j] - prefixarr[i - 1];
        //     }
        //     if(currsum > maxsum){
        //         maxsum = currsum ;
        //     }
        // }
        // System.out.println("The max sum of subarrays : "+maxsum);

        // Method 3 : most optimal kadane's algorithm TC = O(n)
        int sum = 0;
        for(int i=0; i<a1.length; i++){
            sum += a1[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > largest){
                largest = sum;
            }
        }
         System.out.println("The max sum of subarrays : "+ largest);
    }
}