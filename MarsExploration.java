import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/mars-exploration
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length = S.length();
        int num = length/3; 
        char[] array = new char[length];
        array = S.toCharArray();
        int c=0;
        for(int i=0;i<length;i++){
            if(i%3==0 && array[i] != 'S'){
                c++;
            }
            if(i%3==2 && array[i] != 'S'){
                c++;
            }
            if(i%3==1 && array[i] != 'O'){   
                c++;
            }
            
            //System.out.println(array[i]);
        }
        System.out.println(c);
    }
}
