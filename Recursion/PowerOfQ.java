public class PowerOfQ {
    //Method 1 -- Brute Force TC=O(q)
    // public static int PowerOfQ(int p, int q){
    //     if(q==0){
    //         return 1;
    //     }
    //     return p*PowerOfQ(p,(q-1));
    // }

    //Optimized  TC=O(q)
    // public static int PowerOfQ(int p , int q){
    //     if(q==0){
    //         return 1;
    //     }
    //     if(q % 2 != 0){//If q is odd
    //         return PowerOfQ(p,q/2)*PowerOfQ(p,q/2)*p;
    //     }
    //     else{// If q is even
    //         return PowerOfQ(p,q/2)*PowerOfQ(p,q/2);
    //     }
    // }//Here we are calling recursive call two times . So it increases the time complexity . It is better to store a value in a variable and multiply that variable with itself .


    public static int PowerOfQ(int p , int q){
        if(q==0){
            return 1;
        }
        int smallPower = PowerOfQ(p,q/2);
        if(q % 2 != 0){//If q is odd
            return smallPower*smallPower*p;
        }
        else{// If q is even
            return smallPower*smallPower;
        }
    }
    public static void main(String[] args) {
        System.out.print(PowerOfQ(5,4));
    }
}