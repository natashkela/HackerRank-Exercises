import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Discription: https://www.hackerrank.com/contests/w20/challenges/divisible-sum-pairs
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int counter=0;
        //int sum=0;
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            //sum+=a[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i<j&&(a[i]+a[j])%k==0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
