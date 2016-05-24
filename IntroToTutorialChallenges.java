import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int v = read.nextInt();
        int num = read.nextInt();
        int[] a = new int[num];
        for(int i=0;i<num;i++){
            a[i]=read.nextInt();
            if(a[i]==v){
                System.out.println(i);
                break;
            }
        }
    }
}
