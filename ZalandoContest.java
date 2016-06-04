import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
Problem Description: https://www.hackerrank.com/contests/zalando-codesprint/challenges/match-the-shoes
*/
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int m = read.nextInt();//number of distict shoe ids
        int k = read.nextInt();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            int id = read.nextInt();
            list1.add(id);
        }
        //int[] array = new int[m];
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        int count = 0;
        int number = list1.get(0);
        int max=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(!list1.isEmpty()){
            
            if(list1.contains(number)){
                int indexOf = list1.indexOf(number);
                list1.remove(indexOf);
                max++;
            }
            else{
                list2.add(max);
                map.put(number,max);
                number = list1.get(0);
                max=0;
            }
            
            
        }
        //Integer array[]=list2.toArray(new Integer[list2.size()]);
        //int[] array = new int[list2.size()];
        //array.toArray(list2);
        //Arrays.sort(array);
        map = sortByValue(map);
        int counter=0;
        for(Integer i:map.keySet()){
            System.out.println(i);
            counter++;
            //if(counter==n+1){
              //  break;
            //}
        }
    }
    static Map sortByValue(Map map) {
     List list = new LinkedList(map.entrySet());
     Collections.sort(list, new Comparator() {
          public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o1)).getValue())
              .compareTo(((Map.Entry) (o2)).getValue());
          }
     });

    Map result = new LinkedHashMap();
    for (Iterator it = list.iterator(); it.hasNext();) {
        Map.Entry entry = (Map.Entry)it.next();
        result.put(entry.getKey(), entry.getValue());
    }
    return result;
} 
}
