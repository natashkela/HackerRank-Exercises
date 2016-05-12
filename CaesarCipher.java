import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String output = "";
        int a[] = new int[n];
        for(int i=0;i<n;i++){
                a[i] = (int)s.charAt(i);
        }
        if(k<=26){
            for(int i = 0 ; i<n ; i++){
                if((a[i]<=90)&&(a[i]>=65)){
                    a[i] = a[i] + k;
                    if(a[i]>90){
                        a[i] = a[i] - 26;                    
                    }
                    output = output + (char)a[i];

                 }
                else if((a[i]<=122)&&(a[i]>=97)){
                     a[i] = a[i] + k;                  
                    if(a[i]>122){
                        a[i] = a[i] - 26;
                    }
                    output = output + (char)a[i];
                }

            else{
                output = output + (char)a[i];               
                }
            }
            System.out.print(output);
        }
        else{
            for(int i = 0 ; i<n ; i++){
                if((a[i]<=90)&&(a[i]>=65)){
                    a[i] = a[i] + (k%26);
                    if(a[i]>90){
                        a[i] = a[i] - 26;                    
                    }
                    output = output + (char)a[i];
                }   
                else if((a[i]<=122)&&(a[i]>=97)){
                    a[i] = a[i] + (k%26);                  
                        if(a[i]>122){
                        a[i] = a[i] - 26;
                        }
                    output = output + (char)a[i];
                }
                else{
                    output = output + (char)a[i];               
                }
            }
                System.out.print(output);
            }
        }
}
