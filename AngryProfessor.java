import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0;j < t; j++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int countNegative=0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i]<=0){
                    countNegative++;
                }
            }
            if(countNegative<k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
