import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();//number of distict shoe ids
        int k = read.nextInt();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            int id = read.nextInt();
            list1.add(id);
        }
        Integer number = list1.get(0);
        int count=0;
        LinkedList<Integer> countList = new LinkedList<Integer>();
        LinkedList <Integer> numberList = new LinkedList<Integer>();
        while(!list1.isEmpty()){
            if(list1.contains(number)){
                count++;
                list1.remove(number);
            }
            else{
                //System.out.println(number);
                countList.add(count);
                count=0;
                numberList.add(number);
                number=list1.get(0);
            }
        }
        countList.add(count);
        numberList.add(number);
        int z = 0;
        while(z<n){
            int max=countList.get(0); 
            for(int i=0;i<countList.size();i++){
                if(max<countList.get(i)){
                    max = countList.get(i);
                }
            }
            int index = countList.indexOf(max);
            countList.remove(index);
            System.out.println(numberList.get(index));
            numberList.remove(index);
            z++;
        }
    }
}
