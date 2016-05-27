import java.util.*;
import java.io.*;

/*
Problem Description: https://www.hackerrank.com/challenges/30-more-exceptions
*/


//Write your code here
class Calculator{
    int n;
    int p;
    Calculator(){
        this.n = n;
        this.p=p;
    }
    public static int power(int n,int p) throws Exception{
        if(n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int) Math.pow(n,p);
        }
    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
