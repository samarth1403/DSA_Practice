public class sumOfDigitsOfNum {
    public static int sumOfDigitsOfNum(int n){
        if(n==0){//Base Case Given : n >=0 && n <= 9 then return n
            return 0;
        } 
        int lastDigit = n % 10;
        return sumOfDigitsOfNum(n/10) + lastDigit;
    }
    public static void main(String args[]){
        System.out.print(sumOfDigitsOfNum(8));
    }
}