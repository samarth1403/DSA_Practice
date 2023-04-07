import java.util.*;
public class ArmStrongNumber {
    public static int findTotalDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        } 
        return findTotalDigits(n/10) + 1;
    }
    public static int ArmStrongNumberSum(int n, int count){
        int sum = 0;
        if(n>=0 && n<=9){
            sum += Math.pow(n,count);
            return sum;
        }
        sum  += (int)( ArmStrongNumberSum(n/10,count) + Math.pow(n%10,count));
        return sum;
    }
    public static boolean isArmStrongNumber(int n,int count){
        int sum = ArmStrongNumberSum(n,count);
        if(sum == n){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int count = findTotalDigits(371);
        System.out.print(isArmStrongNumber(371,count));
    }
}