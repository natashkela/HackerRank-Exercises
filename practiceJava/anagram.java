import java.io.*;
import java.util.*;

/*
Problem Description: https://www.hackerrank.com/challenges/java-anagrams
*/

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       boolean fal=true;
       A=A.toLowerCase();
       B=B.toLowerCase();
       if(A.length()!=B.length()){
           return false;
       }
       else{
           char[] a = new char[A.length()];
           a=A.toCharArray();
           char[] b = new char[B.length()];
           b=B.toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);
           for(int i=0;i<B.length();i++){
               if(a[i]==b[i]){
                   
               }
               else{
                   return false;
               }
           }
       }
       return true;
      }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
