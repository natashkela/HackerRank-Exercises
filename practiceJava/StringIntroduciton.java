import java.io.*;
import java.util.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-strings-introduction
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a= A.length();
        int b= B.length();
        System.out.println(a+b);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.printf("%s %s",A.substring(0,1).toUpperCase()+A.substring(1),B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
