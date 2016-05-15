import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        /*char[] array = new char[input.length()];
        array = input.toCharArray();*/
        
        for(int j=0;j<num;j++){
            String even="";
            String odd="";
            String input = read.next();
            for(int i=0;i<input.length();i=i+2){
                even = even + input.charAt(i);
            }
            for(int i=1;i<input.length();i=i+2){
                odd=odd+input.charAt(i);
            }
            //System.out.println(even);
            System.out.printf("%s %s\n",even,odd);
        }
    }
}
