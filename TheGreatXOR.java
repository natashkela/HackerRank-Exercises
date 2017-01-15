import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Exercise link: https://www.hackerrank.com/contests/w28/challenges/the-great-xor

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int counter = 0;
        for(int a0 = 0; a0 < q; a0++){
            counter=0;
            long x = in.nextLong();
            // your code goes here
            if(x>0){
                for(int a=0;a<x;a++){
                    if((a^x)>x){
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
        
    }
}
