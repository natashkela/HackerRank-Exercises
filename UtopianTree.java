import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/utopian-tree
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int cycle=1;
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                if(j%2==0){
                    cycle=2*cycle; //2  //4
                }
                else {
                    cycle = cycle+1; //3  //5
                }
            }
            if(n==0){
                cycle=1;
            }
            System.out.println(cycle);
        }
    }
}
