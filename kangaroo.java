import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/kangaroo
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean a=false;
        while(a!=true){
               if(x1==x2){
                   System.out.println("YES");
                   a=true;
               }
               if(x2>x1 && v2>=v1){
                    System.out.println("NO");
                    a=true;
                }
               if(x1>x2 && v1>=v2){
                    System.out.println("NO");
                    a=true;
                }
               x1=x1+v1;
               x2=x2+v2;               
        }
    }
}
