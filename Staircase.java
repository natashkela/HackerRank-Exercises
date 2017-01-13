import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

/*
 * Complete the function below.
 */

    static void StairCase(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j+i>n){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
       
    }

 public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
        
    }
}
