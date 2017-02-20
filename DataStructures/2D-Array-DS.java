import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Address: https://www.hackerrank.com/challenges/2d-array

public class Solution {
    public static int maxHoursGlass=-63;
    public static int arr[][] = new int[6][6];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                hourglass(i,j);
            }
        }
        System.out.println(maxHoursGlass);
    }
    public static int hourglass(int i,int j){
        int sum=0;
        for(int k=j;k<=j+2;k++){
            sum+=arr[i][k];
            sum+=arr[i+2][k];
        }
        sum+=arr[i+1][j+1];
        if(sum>maxHoursGlass){
            maxHoursGlass = sum;
        }
        return sum;
        
    }
}
