import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem Description: https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n",N,i,N*i);
        }
    }
}
