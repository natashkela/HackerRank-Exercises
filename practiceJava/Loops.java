import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-loops
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for(int i=0;i<num;i++){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int result = a;
            for(int j=0;j<c;j++){
                result+=b*(int)Math.pow(2,j);
                System.out.print(result+" ");
            }
            System.out.println("");
        }
    }
}
