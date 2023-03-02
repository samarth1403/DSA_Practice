public class LargestandSmallest {

    public static void largestNumber(int[] a1){
        int largestNumber = a1[0]; // or int largestNumber = Integer.MIN_VALUE = -infinity
        for(int i=1; i<a1.length; i++){
            if(a1[i] > largestNumber){
                largestNumber = a1[i];
            }
        }
        System.out.println("The largest number in the array is "+ largestNumber);
    }

    public static void smallestNumber(int[] a1){
        int smallestNumber = a1[0]; // int smallestNumber = Integer.MAX_VALUE = +infinity
        for(int i=1; i<a1.length; i++){
            if(a1[i] < smallestNumber){
                smallestNumber = a1[i];
            }
        }
        System.out.println("The Smallest number in the array is "+ smallestNumber);
    }

    public static void main(String[] args) {
        int[] a1 = {11,14,22,20,58};
        largestNumber(a1);
        smallestNumber(a1);
    }
}