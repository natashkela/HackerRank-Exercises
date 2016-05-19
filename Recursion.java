import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/30-recursion
*/

public class Solution {
    static int result = 1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(factorial(number));
    }
    
    public static int factorial(int number){
        if(number>=1){
            result = number * factorial(number-1);
        }
        return result;
    }
}
