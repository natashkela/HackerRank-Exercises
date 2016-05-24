import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	
    Difference(int[] elements){
        this.elements = elements;
    }
   void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
   }

    } // End of Difference class

public class Solution {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Difference D = new Difference(a);

                D.computeDifference();

              	System.out.print(D.maximumDifference);
            }
        }
