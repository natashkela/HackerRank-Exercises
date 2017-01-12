import java.io.*;
import java.util.*;

public class Solution {
    /*
    Exercise URL: https://www.hackerrank.com/challenges/saveprincess2/copy-from/35671819
    */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.nextLine();
        String rowcol = read.nextLine();
        int row = Character.getNumericValue(rowcol.charAt(0));
        int col = Character.getNumericValue(rowcol.charAt(2));
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i]=read.nextLine();
        }
        nextMove(n,row,col,array);
    }
    public static boolean nextMove(int n, int row, int col, String[] array){
        int r = 0;
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i].charAt(j)=='p'){
                    r=i;
                    c=j;
                }
            }
        }
        //LEFT, RIGHT, UP or DOWN
        int ro = row -r;
        int co = col - c;
        if (ro>0){
            System.out.println("UP");
            return true;
        }
        else if(ro<0){
            System.out.println("DOWN");
            return true;
        }
        if(co>0){
            System.out.println("LEFT");
            return true;
        }
        else if(co<0){
            System.out.println("RIGHT");
            return true;
        }
        
       
        return true;
        
    }
}
