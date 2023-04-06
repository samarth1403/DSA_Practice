public class NthFibonacci {
    
    public static int nthFibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
    
    public static void main(String[] args) {
        System.out.print(nthFibonacciNumber(5));
    }
}