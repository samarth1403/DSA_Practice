public class Subarrays {
    public static void main(String[] args) {
        int[] a1 = {2,4,6,8,10};
        int totalSubarrays = 0; 
        for(int i=0; i<a1.length; i++){
            int start = i;
            for(int j=i; j<a1.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(a1[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : " + totalSubarrays);
    }
}