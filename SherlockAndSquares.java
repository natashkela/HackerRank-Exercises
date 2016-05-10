import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int t = read.nextInt(); //num of test cases
        for(int i=0;i<t;i++){
            int counter =0;
            int a = read.nextInt();
            int b = read.nextInt();
            for(int j=a;j<=b;j++){
                int sqrt = (int)Math.sqrt(j);
                if(j==sqrt*sqrt){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
