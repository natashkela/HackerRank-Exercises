import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/countingsort1
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=read.nextInt();
            list.add(a);
        }
        for(Integer i=0;i<100;i++){
            if(list.contains(i)){
                System.out.print(Collections.frequency(list,i));
                System.out.print(" ");
            }
            else{
                System.out.print("0 ");
            }
        }
        
    }
}
