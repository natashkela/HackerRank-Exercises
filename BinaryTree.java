import java.io.*;
import java.util.*;

/*
https://www.hackerrank.com/challenges/30-binary-trees
*/

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    static void levelOrder(Node root){
    Queue<Node> nodes = new LinkedList();
    nodes.add(root);
    
    while(!nodes.isEmpty()){
        Node a = nodes.remove();
        System.out.print(a.data+" ");
        if (a.left!=null){
            nodes.add(a.left);
        }
        if (a.right!=null){
            nodes.add(a.right);
        }
    }
}	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
