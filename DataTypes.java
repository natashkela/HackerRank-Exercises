import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/30-data-types
view it there
*/

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in); 
        /* Declare second integer, double, and String variables. */
        int intNum = scan.nextInt();
        double doubleNum = scan.nextDouble();
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        //System.out.println(newString);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+intNum);
        System.out.println(d+doubleNum);
        System.out.println(s.concat(s2));
        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}
