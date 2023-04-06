public class countOfDigits {
    public static int countOfDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return countOfDigits(n/10) + 1;
        
    }
    public static void main(String args[]){
        System.out.print(countOfDigits(12345677));
    }
}