public class PalindromeSubstring  {

    public static boolean isPalindromeCount(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbd";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int start = i;
            for(int j=i+1; j<=s.length(); j++){
                int end = j;
                String str = s.substring(start , end);
                if(isPalindromeCount(str) == true){
                    count++;
                    System.out.print(str+" ");
                }
            }
            
        }
        System.out.println(count);
    }
}