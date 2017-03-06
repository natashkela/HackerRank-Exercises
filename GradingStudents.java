import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if(grade>=38&&grade%5!=0){
                int nextMultiple = grade/10;
                int multipleOfFive = nextMultiple*10+5;
                int multipleOfTen = nextMultiple*10+10;
                if((multipleOfFive-grade)<3&&(multipleOfFive-grade>0)){
                    System.out.println(multipleOfFive);
                }
                 else if  ((multipleOfTen-grade<3)&&(multipleOfTen-grade>0)){
                    System.out.println(multipleOfTen);
                }
                else {
                    System.out.println(grade);
                }
            }
            else if(grade%5==0){
                System.out.println(grade);
            }
            else{
                System.out.println(grade);
            }
        }
    }
}
