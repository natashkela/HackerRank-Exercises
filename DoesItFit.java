import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/contests/zalando-codesprint/challenges/does-it-fit
*/

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        int area = width*height;
        int num = read.nextInt();
        read.nextLine();
        for(int i=0;i<num;i++){
            String line = read.nextLine();
            //double ShapeArea =0;
            int wid=0;
            int hei=0;
            int r=0;
            char shape = line.charAt(0);
            if(shape == 'R'){
             wid = Character.getNumericValue(line.charAt(2));
             hei = Character.getNumericValue(line.charAt(4));
            }
            else{
                r = Character.getNumericValue(line.charAt(2));
            }
            if(shape=='C'){
               if(2*r<=width&&2*r<=height){
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }
            }
            else {
                if((wid<=width&&hei<=height)||(wid<=height&&hei<=width)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        
    }
}
