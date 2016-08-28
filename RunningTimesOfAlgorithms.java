import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/runningtime/copy-from/26659047
*/

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
        int counter=0;
          for(int i=0;i<ar.length-1;i++){
              int j=i+1;
              while(j>0 && ar[j]<ar[j-1]){
                  int temp = ar[j];
                  ar[j]=ar[j-1];
                  ar[j-1]=temp;
                  j--;
                  counter++;
              }
               
              }
        System.out.println(counter);    
          
    }  
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
