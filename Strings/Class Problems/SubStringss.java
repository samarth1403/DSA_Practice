public class SubStringss {
    public static void main(String[] args) {
        String str = "abcde";
        int count = 0;
        // Method 1 : Brute force method
        // for(int i=0; i<str.length(); i++){
        //     int start = i; 
        //     for(int j=i; j<str.length(); j++){
        //          int end = j;
        //          for(int k=start; k<=end; k++){
        //             System.out.print(str.charAt(k));
        //          }
        //          count =  count + 1;
        //          System.out.println();
        //     }
        //     System.out.println();
        // }

        // Method 2 : using substring() TC = O(n^2);

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
                count++;
            }
        }
        System.out.println("The total no of Substrings are : "+count);
    }
}