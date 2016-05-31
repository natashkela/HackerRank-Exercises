import java.lang.reflect.Method;
/*
Problem Description: https://www.hackerrank.com/challenges/30-generics
*/

class Solution {

    //Write your code here
    public static void printArray(Object[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
        
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
    
    
