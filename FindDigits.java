import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int counter=0;
            int n = in.nextInt();
            String num = String.valueOf(n);
            char[] a = num.toCharArray();
            for(int i=0;i<a.length;i++){
                int number = Character.getNumericValue(a[i]);
                if(number!=0){
                   if(n%number==0){
                       counter++;
                   }
                }
            }
            System.out.println(counter);
        }
    }
}
