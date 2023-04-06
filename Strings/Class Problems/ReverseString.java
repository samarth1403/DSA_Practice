import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String s1 = "reverse";
        String sub = "";
        System.out.println("The original String is : "+s1);
        for(int i=(s1.length() - 1); i>=0; i--){
            sub += s1.charAt(i);
        }
        System.out.println("The reverse of string is : "+ sub);

        //Method 2 - Using StringBuilder
        // StringBuilder s1 = new StringBuilder("reverse");
        // for(int i=0; i <= s1.length()/2; i++){
        //      s1.setCharAt(i,s1.charAt((s1.length()-1) - i));
        // }
        // System.out.println("The reverse of the string is : "+ s1);

        
    }

    
}