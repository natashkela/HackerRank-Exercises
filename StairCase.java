import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
            String result="";
            for(int j=0;j<n-(i+1);j++){
                result+=" ";
            }
            for(int j=0;j<i+1;j++){
                result+="#";
            }
            System.out.println(result);
        }
    }
}
