public class Basics {

    public static void printNaturalNumbers(int n){
        if(n==1){//Base Case : From here function will be returned
            System.out.print(1+" ");
            return;
        }
        
        printNaturalNumbers(n-1);//Assumption : This is our assumption that this function will print numbers from 1 to (n-1)
        System.out.print(n+" ");//Self Work
    }

    public static int findFactorial(int n){
        int factorial;
        if(n==0){
            return 1;
        } 
        return n * findFactorial(n-1);
    }

    public static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        } 
        return sumOfNaturalNumbers(n-1) + n;
    }


    public static void main(String args[]){
        //printNaturalNumbers(5);
        //int ans = findFactorial(6);
        // int ans = sumOfNaturalNumbers(5);
        System.out.println("The factorial is : ");
    }
}