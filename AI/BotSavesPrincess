import java.io.*;
import java.util.*;

/*
Link to Exercise: https://www.hackerrank.com/challenges/saveprincess
*/

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String[] array = new String[n];
        read.nextLine();
        for(int i=0;i<n;i++){
            array[i]=read.nextLine();
        }
        displayPathtoPrincess(n,array);
    }
    
    public static void displayPathtoPrincess(int n, String[] array){
        int brow=0;
        int bcol=0;
        int prow=0;
        int pcol=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i].charAt(j)=='m'){
                    brow = i;
                    bcol = j;
                }
                else if(array[i].charAt(j)=='p'){
                    prow=i;
                    pcol=j;
                }
            }
        }
        int rows = brow - prow;
        int cols = bcol - pcol;
        if(rows<0){
            rows=rows*(-1);
            for(int i=0;i<rows;i++){
                System.out.println("DOWN");
            }
        }
        else if(rows>0){
            for(int i=0;i<rows;i++){
                System.out.println("UP");
            }
        }
        if(cols>0){
            for(int i=0;i<cols;i++){
                System.out.println("LEFT");
            }
        }
        else if(cols<0){
            cols = cols * (-1);
            for(int i=0;i<cols;i++){
                System.out.println("RIGHT");
            }
        }
        
    }
}
