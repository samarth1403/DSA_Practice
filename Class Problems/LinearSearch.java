public class LinearSearch {
   
    // Time Complexity of Linear Search is O(n);
    public static void findIndex(int a1[] ,int key){
        for(int i=0; i<a1.length; i++){
            if(a1[i] == key){
                System.out.println("The given element is found at index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {11,12,13,14,15};
        findIndex(a1 , 15);
    }
}