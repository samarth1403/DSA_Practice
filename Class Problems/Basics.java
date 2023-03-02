public class Basics {
    public static void main(String[] args) { 

        //declaration of Array
        //int[] marks;

        //Allocation of memory
        int[] marks = new int[3];

         // Allocation of memory and initialization
        int[] numbers = {11,12};

        // Updation
        numbers[0] = 22;
        
        // Output
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println(numbers[i] + " ");
        // }

        // Adding element at the end of an array
        // int[] a1 = {11,12};
        // int[] a2 = new int[a1.length + 1];

        // for(int i=0; i<a1.length; i++){
        //     a2[i] = a1[i];
        // }

        // a2[a2.length - 1] = 22;

        // for(int i=0; i<a2.length; i++){
        //     System.out.println(a2[i] + " ");
        // }

        // Deleting last element of the array
        // int[] a1 = {11,12,13};
        // int[] a2 = new int[a1.length - 1];

        // for(int i=0; i<a2.length; i++){
        //     a2[i] = a1[i];
        // }

        // for(int i=0; i<a2.length; i++){
        //     System.out.println(a2[i] + " ");
        // }

        // Adding element in the middle of the array at index 1
        // int[] a1 = {11,12,13};
        // int[] a2 = new int[a1.length + 1];

        // for(int i=0; i<1; i++){
        //     a2[i] = a1[i];
        // }
        // a2[1] = 25;

        // for(int i=1+1; i<a2.length; i++){
        //     a2[i] = a1[i-1];
        // }

        // for(int i=0; i<a2.length; i++){
        //     System.out.println(a2[i] + " ");
        // }


        // Deleting an element in the middle from index 1
        int[] a1 = {11,12,13};
        int[] a2 = new int[a1.length - 1];

        for(int i=0; i<1; i++){
            a2[i] = a1[i];
        }

        for(int i=2; i<a1.length; i++){
            a2[i - 1] = a1[i];
        }

        for(int i=0; i<a2.length; i++){
            System.out.println(a2[i] + " ");
        }
    }
}