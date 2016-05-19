import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
Problem Description: https://www.hackerrank.com/challenges/funny-string
*/
public class Solution {

    public static void main(String[] args) {
            Scanner read = new Scanner( System.in );
            int num = read.nextInt();
            for(int j=0;j<num;j++){
                String word = read.next();
                StringBuilder str = new StringBuilder(word);
                String reverse=str.reverse().toString();
                int counter=0;
                for (int i=0;i<word.length()-1;i++){
                    if(Math.abs((int)word.charAt(i+1)-(int)word.charAt(i)) == 
                       Math.abs((int)reverse.charAt(i+1)-(int)reverse.charAt(i))){
                            counter++;
                    }
                    else{
                        System.out.println("Not Funny");
                        break;
                    }
            }
            if(counter == word.length()-1){
               System.out.println("Funny");
            }

   }
}
}
