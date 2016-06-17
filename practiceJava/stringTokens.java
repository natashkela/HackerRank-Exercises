import java.io.*;
import java.util.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-string-tokens
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s=s.trim();
        String delims = "[ _@'.,?!]+";
        String[] tokens = s.split(delims);
        if(s.length()!=0){
            System.out.println(tokens.length);
            for(int i=0;i<tokens.length;i++){
                System.out.println(tokens[i]);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
