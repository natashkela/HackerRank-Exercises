import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-1d-array-easy
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i]=read.nextInt();
        }
        int counter=0;
        for(int i=0;i<num;i++){
            int sum =0;
            for(int j=i;j<num;j++){
                sum = array[j]+sum;
                if(sum<0){
                    counter++;
                    //sum=0;
                }
            }
        }
        System.out.println(counter);
    }
}
