//GCD -- Greatest Common Divisor
// e.g Factors of 12 = 1,2,3,4,6,12
//     Factors of 16 = 1,2,4,8,12
//    Common Divisor = 1,2,4
// Thus , Greatest Common Divisor = 4
import java.util.*;
public class GCD {
    // //Brute Force Method 
    // public static int GCD(int a , int b){
    //     int x = Math.min(a,b);
    //     for(int i=x; i>0; i--){
    //         if(a%i == 0 && b%i == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // //Method 2 - Long Division Method
    // public static int GCD(int x, int y){
    //     while(x%y != 0){
    //         int remainder = x % y;
    //         x = y ;
    //         y = remainder ;
    //     }
    //     return y;
    // }

    //Method 3 - Using Eucled's Algorithm
   // Euclid's Algorithm : GCD(x,y) == GCD(y,x%y) and GCD(x,0) == x
   public static int GCD(int x, int y){
    if(y==0){
        return x;
    }
    return GCD(y,x%y);
   }
    public static void main(String[] args) {
       System.out.print(GCD(12,16));  
    }
}