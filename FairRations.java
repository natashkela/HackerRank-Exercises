import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/contests/hourrank-9/challenges/fair-rations/copy-from/5976657
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int counter=0;
        for(int B_i=0; B_i < N; B_i++){
            a[B_i] = in.nextInt();
        }
        for(int i=0;i<N-1;i++){
            if(a[i]%2!=0){
               // System.out.println(a[i]);
                a[i]=a[i]+1;
                //System.out.println("first");
                counter++;
                if(i!=0){
                    if(a[i-1]%2!=0){
                        a[i-1]=a[i-1]+1;
                        counter++;
                       // System.out.println("second");
                    }
                    else if(a[i+1]%2!=0){
                        a[i+1]=a[i+1]+1;
                        counter++;
                        //System.out.println("third");
                    }
                    else{
                        a[i+1]=a[i+1]+1;
                        counter++;
                    }
                }
                else{
                    a[i+1]=a[i+1]+1;
                    counter++;
                }
            }
            
        }
        boolean value = true;
        for(int i=0;i<N;i++){
            if(a[i]%2!=0){
                value=false;
            }
        }
        if(value==false){
            System.out.println("NO");
        }
        else{
            System.out.println(counter);
        }
    }
}
