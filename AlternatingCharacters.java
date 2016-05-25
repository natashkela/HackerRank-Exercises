import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/alternating-characters
view it on hackerrank
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        String word = "";
        for(int i=0; i<num; i++){
            word=read.next();
            LinkedList<String> result = new LinkedList<String>();
            for(int j=1;j<word.length();j++){
                if(word.charAt(j)==word.charAt(j-1)){
                    result.add(Character.toString(word.charAt(j)));
                }
                //else{
                  //  result.add(Character.toString(word.charAt(j)));
                //}
            }
            System.out.println(result.size());
        }
    }
}
