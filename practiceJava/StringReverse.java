import java.io.*;
import java.util.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-string-reverse
*/

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean a=true;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=A.charAt(A.length()-i-1)){
                a=false;
            }
        }
        if(a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
