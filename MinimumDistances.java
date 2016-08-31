import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/minimum-distances
*/

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = read.nextInt();
        }
        int largest=999999;
        int temp=-1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    temp=j-i;
                    if(largest>temp){
                        largest=temp;
                    }
                }
            }
        }
        if(largest==999999){
            largest=-1;
        }
        System.out.println(largest);
    }
}
