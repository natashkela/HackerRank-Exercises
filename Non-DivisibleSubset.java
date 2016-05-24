import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/contests/w20/challenges/non-divisible-subset/copy-from/5930767
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int k = read.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            a[i]=read.nextInt();
        }
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if((a[i]+a[j])%k!=0){
                    if(!list.contains(a[i])){
                        list.add(a[i]);
                    }
                    if(!list.contains(a[j])){
                        list.add(a[j]);
                    }
                }
            }
        }
        
        
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))%k==0){
                    list.remove(i);
                }
            }
        }
        System.out.println(list.size());
    }
}
