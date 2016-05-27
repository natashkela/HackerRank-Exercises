import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result =0;
        try{
            result = Integer.parseInt(S);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
