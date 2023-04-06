//  Reverse each word in a string 
// input --- I am an educator
// output --- I ma na rotacude   
import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "am an educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
          
            if(ch != ' '){
              sb.append(ch);
            }
            else{
              sb.reverse();
              ans += sb;
              ans += ' ';
              sb = new StringBuilder("");
            }
        }
        sb.reverse(); // The last word is not reversed because it don't have sapace at end . thus if condition was true . Thus it got executed .
        ans += sb;
        System.out.println(ans);
        }
    }

