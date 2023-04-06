// make a character to uppercase if it is in lowercase and vice versa
// input -- "HelLo"
// output -- "hELlO"

import java.util.*;

public class Toggle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //StringBuilder sb = new StringBuilder(sc.nextLine());

    // Ascii value of characters is important
    // A = 65 , a = 97 , 0 = 48 Difference between a - A = 32 and this remains constant for each and every character .
    // If character has Ascii value in between (65 to 90) then it is Capital and in between (97 to 122) then it is small letter .
    //System.out.println("Input : " + sb);

    // for(int i=0; i<sb.length(); i++){
    //     char ch = sb.charAt(i);
    //     int Ascii = ch ;
    //     if(Ascii <= 90 && Ascii >= 65){
    //         sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
    //     }
    //     else{
    //         sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
    //     }
    // }

    // Method 2 - Without using Character class means only using ascii value
    // for(int i=0; i<sb.length(); i++){
    //         char ch = sb.charAt(i);
    //         int Ascii = ch ;
    //         if(ch == ' '){ // Edge Case
    //             continue;
    //         }
    //         else{
    //             if((Ascii <= 90 && Ascii >= 65)){
    //                 // Uppercase
    //                 Ascii = Ascii + 32;
    //                 sb.setCharAt(i,(char)Ascii);
    //             }
    //             else if((Ascii <= 122 && Ascii >= 97)){
    //                 Ascii = Ascii - 32;
    //                 sb.setCharAt(i,(char)Ascii);
    //             }
    //             else{ // Edge case for numbers
    //                 continue;
    //             }
    //         }

    //     }

    // Method : If we have to do by using string only
    String str = sc.nextLine();
    StringBuilder str2 = new StringBuilder(str);
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int Ascii = ch;
      if (ch == ' ') { // Edge Case
        continue;
      } else {
        if ((Ascii <= 90 && Ascii >= 65)) {
          // Uppercase
          Ascii = Ascii + 32;
          char dh = (char)Ascii;
          str = str.substring(0,i) + dh + str.substring(i+1);
        } else if ((Ascii <= 122 && Ascii >= 97)) {
          Ascii = Ascii - 32;
          char dh = (char)Ascii;
          str = str.substring(0,i) + dh + str.substring(i+1);
        } else { // Edge case for numbers
          continue;
        }
      }
    }

    System.out.println("Output : " + str);
  }
}
