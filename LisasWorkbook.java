import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/bear-and-workbook
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int chapters = read.nextInt(); //number of chapters
        int maxProb = read.nextInt(); //number of problems per page
        int[] a = new int[chapters]; //problems in each chapter
        for(int i = 0;i<chapters;i++){
             a[i] = read.nextInt();
        }

        int pagenumber = 0;
        int counter = 0;
        for(int i =0;i<chapters;i++){
            int problem = a[i];
            pagenumber++;
            for(int j=1; j <= problem; j++){
                if((j-1)%maxProb == 0 && j!=1){
                    pagenumber++;
                }
                if(pagenumber == j){
                    counter++;
                }
            }
    }
    System.out.print(counter);
    }
}
