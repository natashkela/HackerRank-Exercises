import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double countPositive=0;
        double countNegative=0;
        double countZero=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0){
                countZero++;
            }
            else if(arr[arr_i]>0){
                countPositive++;
            }
            else{
                countNegative++;
            }
        }
        double resultPositive = countPositive/n;
        double resultNegative = countNegative/n;
        double resultZero = countZero/n;
        System.out.println(resultPositive);
        System.out.println(resultNegative);
        System.out.println(resultZero);
    }
}
