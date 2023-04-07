import java.util.*;
public class LCM {
    // //Method 1 -- Brute Force Method
    // public static int LCM(int a, int b){
    //     int x = Math.max(a,b);
    //     int y = Math.min(a,b);
    //     int i = 1;
    //     while(true){
    //         int multiple = x*i;
    //         if(multiple % y == 0){
    //             return multiple;
    //         }
    //         i++;
    //     }
    // }


    // // Method 2 : Using Euclid Algorithm 
    // // As we GCD * LCM = X * Y
    // // Thus, LCM = (x*Y)/GCD
    // public static int GCD(int a, int b){
    //     if(b==0){
    //         return a;
    //     }
    //     return GCD(b,a%b);
    // }

    // public static int LCM(int a, int b){
    //     int GCDValue = GCD(a,b);
    //     return Math.abs(a*b)/GCDValue;
    // }

    public static void main(String args[]){
        System.out.print(LCM(336,54));
    }
}