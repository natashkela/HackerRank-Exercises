import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/two-strings
Tried to solve it by having two for loops: took too much time 
thought that converting one string to char array and then to linked list and
then using contains method to see if there is at least one character that matches
took too much time too. 

After that decided to use charsets.
*/

public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner read = new Scanner (System.in);
    int num = read.nextInt();
    for (int i=0;i<num;i++) {
        Set<Character> char1 = toCharSet(read.next());
        Set<Character> char2 = toCharSet(read.next());
        char1.retainAll(char2);

        if (char1.size()>0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

public static Set<Character> toCharSet(String str) {
    Set<Character> charSet = new HashSet<Character>();
    for (int i=0;i<str.length();i++) {
        charSet.add(str.charAt(i));
    }
    return charSet;
    }
}
