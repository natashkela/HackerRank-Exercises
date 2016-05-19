import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Integer.toBinaryString(n);
        char[] array = new char[binary.length()];
        array = binary.toCharArray();
        int counter = 0;
        int max = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]=='1'){
                counter++;
                if(counter>max){
                    max=counter;
                }
            }
            else{
                counter=0;
            }
            
        }
        System.out.println(max);
    }
}
