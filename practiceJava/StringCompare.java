import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-string-compare
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        //read.next();
        String line = read.next();
        int num = read.nextInt();
        //LinkedList<String> list = new LinkedList<String>();
        //LinkedList<String> words = new LinkedList<String>();
        int counter = 0;
        String word="";
        String max="";
        String min="";
        for(int i=0;i<=line.length()-num;i++){
          word = line.substring(i,i+num);
            if(i==0){
                max = word;
                min=word;
            }
            if(word.compareTo(max)>0){
                max=word;
            }
            if(word.compareTo(min)<0){
                min=word;
            }
        }
       
        
        System.out.println(min);
        System.out.println(max);
        
    }
}
