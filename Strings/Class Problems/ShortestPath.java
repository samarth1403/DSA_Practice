import java.util.*;
public class ShortestPath {

    public static double findShortestPath(String s1){
        int x = 0;
        int y = 0;
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch == 'E'){
                x++;
            }
            else if(ch == 'W'){
                x--;
            }
            else if(ch == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        int xsquare = x*x;
        int ysquare = y*y;
        return Math.sqrt((xsquare + ysquare));
    }
    public static void main(String[] args) {
        String s1 = "WNEENESENNN";
        double ans = findShortestPath(s1);
        System.out.println("The distance of shortest path is : "+ans);
    }
}