
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> hashmap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hashmap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(hashmap.containsKey(s)){
                System.out.printf("%s=%d\n",s,hashmap.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
