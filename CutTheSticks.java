import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int allsame=0;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(min==arr[i]){
                allsame++;
            }
        }//find minimum
        if(allsame!=arr.length){
        System.out.println(arr.length);
        LinkedList <Integer> nums = new LinkedList<Integer>();
        
        for(int i=0;i<n;i++){
            if(arr[i]-min>0){
                nums.add(arr[i]-min);
            }
        }
        System.out.println(nums.size());
        while(nums.size()>0){
            LinkedList<Integer> numbers = new LinkedList<Integer>();
             min  = Collections.min(nums);
            for(int i=0;i<nums.size();i++){
                if(nums.get(i)-min>0){
                    numbers.add(nums.get(i));
                }
            }
            nums = numbers;
            if(nums.size()!=0){
                System.out.println(nums.size());
            }
        }
        }
        else{
            System.out.println(arr.length);
        }
    }
}
