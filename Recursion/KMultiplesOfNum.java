public class KMultiplesOfNum {
    public static void KMultiplesOfNum(int num , int k){
        if(k==1){
            System.out.print(num + " ");
            return;
        }
        KMultiplesOfNum(num,k-1);
        System.out.print((k*num)+" ");

    }

    public static void main(String[] args) {
        int num = 5 ; 
        int k = 1;
        KMultiplesOfNum(num,k);
    }
}