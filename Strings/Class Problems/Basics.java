public class Basics {
    public static void main(String[] args) {
        // Two ways to define a string
        // Strings which are made by using String class are immutable .
        // Strings which are made by using StringBuffer and StringBuilder class are mutable(can be changed) .
        String s1 = new String("Samrth Ikkalaki "); // gets memory in heap
        String s2 = "Ambika Ikkalaki"; // gets memory in String constant pool . This string is sharable

        System.out.println("Length : "+ s1.length()); // length() used to find length

        System.out.println("Concatanation of Stings : " + s1.concat(s2)); // .concat() used to join two strings

        for(int i=0; i<s1.length(); i++){
            System.out.println("The characters are : "+ s1.charAt(i)); // .charAt(i) used to get character at particular position
        }
    }
}