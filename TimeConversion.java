import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem Description: https://www.hackerrank.com/challenges/time-conversion
*/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        //System.out.println(time.substring(8,10));
        if(time.substring(8,10).equals("PM")){
            String hour = time.substring(0,2);
            //System.out.println(hour);
            String left = time.substring(2,8);
            int thour = Integer.parseInt(hour);
            if(thour<12){
            thour=thour+12;
            String beginning = String.valueOf(thour);
            beginning=beginning+left;
                System.out.println(beginning);
            }
            else{
                System.out.println(time.substring(0,8));
            }
        }
        else{
            if(time.substring(0,2).equals("12")){
            String left = time.substring(2,8);
            String beginning = "00";
            beginning=beginning+left;
            System.out.println(beginning);
            }
            else{
            System.out.println(time.substring(0,8));
            }
        }
    }
}
