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
            int n = in.nextInt(); 
            int c = in.nextInt();
            int m = in.nextInt(); //wrappers needed to get one free chocolate
            int total = n/c; //how many chocolates he buys
            int wrappers = total; //how many wrappers he has
            while(wrappers >= m) { 
                total = total + (wrappers/m);
                int leftover = wrappers%m;
                wrappers = (wrappers/m) + leftover;
            }
            System.out.println(total);
        }
    }
}
