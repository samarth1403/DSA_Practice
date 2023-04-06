// Palindrome - reverse of a string is also the same

public class PalindromeString {
    
    public static boolean isPalindrome(String s1){
       
        boolean ans = true;
        for(int i=0; i<=s1.length()/2; i++){
            if(s1.charAt(i) != s1.charAt((s1.length() - 1) - i)){
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        boolean ans = isPalindrome(s1);
        System.out.println(ans);
    }
}