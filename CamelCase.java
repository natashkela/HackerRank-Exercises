import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/camelcase
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] a = new char[s.length()];
        a = s.toCharArray();
        int counter=0;
        for(int i=0;i<a.length;i++){
            if((int)a[i]>=65&&(int)a[i]<=90){
                counter++;
            }
        }
        counter++;
        System.out.println(counter);
    }
}
