import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// Exercise link : https://www.hackerrank.com/contests/w28/challenges/boat-trip
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        
        int max_passanger = m*c;
        
        boolean can = true;
        for(int i=0;i<n;i++){
            if(p[i]>max_passanger){
                can = false;
            }
        }
        
        if(can){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
