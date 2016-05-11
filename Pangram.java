import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();
        sentence = sentence.toLowerCase();
        int counter=0;
        if(sentence.contains(" ")){
            sentence = sentence.replaceAll("\\s+","");
        }
        //System.out.println(sentence);
        if(sentence.length()>=26){
            //System.out.println("yoo");
            char[] array = new char[sentence.length()];
            array = sentence.toCharArray();
            Arrays.sort(array);
            LinkedList<Integer> nums = new LinkedList<Integer>();
            for(int i=0;i<sentence.length();i++){
                nums.add((int)array[i]);
            }
            for(int i=97;i<=122;i++){
                if(nums.contains(i)){
                    counter++;
                }
               }
            //System.out.println(counter);
            if(counter==26){
                System.out.println("pangram");
            }
            else{
                System.out.println("not pangram");
            }
        }
        else{
            System.out.println("not pangram");
        }
    }
}
