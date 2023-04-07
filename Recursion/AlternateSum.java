// Find Sum of Natural Numbers with alternate Signs 
// 1-2+3-4+5-6
public class AlternateSum {
    public static int AlternateSum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return AlternateSum(n-1) - n;
        }
        else{
            return AlternateSum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        System.out.print(AlternateSum(10));
    }
}