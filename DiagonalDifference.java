import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/diagonal-difference
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primarySum=0;
        int secondarySum=0;
        int difference=0;
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
                if(i==j){
                    primarySum+=a[i][j];
                }
                if((i+j)==(n-1)){
                    secondarySum+=a[i][j];
                }
            }
        }
        difference = Math.abs(primarySum-secondarySum);
       System.out.println(difference);
    }
}
