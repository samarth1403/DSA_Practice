public class PairsInArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int count = 0;
        for(int i=0; i<a1.length; i++){
            for(int j=i+1; j<a1.length; j++){
                System.out.print("("+a1[i]+","+a1[j]+")");
                count++;
            }
        }
        System.out.println("Total no. of pairs : " + count);     
    }
}