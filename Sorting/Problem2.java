// Arrange fruits in lexographical order 
// Input = {"papaya","lime","watermelon","apple","mango","kiwi"}
// Output = {"apple","kiwi","lime","mango","papaya","watermelon"}
import java.util.*;
public class Problem2 {
    public static void lexographicalOrder(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if((arr[minIndex].compareTo(arr[j])) > 0){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"papaya","lime","watermelon","apple","mango","kiwi"};
        lexographicalOrder(arr);
        for(String str : arr){
            System.out.print(str + " ");
        }
    }
}