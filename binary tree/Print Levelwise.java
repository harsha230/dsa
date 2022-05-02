/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.*;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        if(root==null)
            return ;
        q.add(root);
        while(!q.isEmpty()){
			BinaryTreeNode<Integer> p=q.poll();
            if(p.left!=null&&p.right!=null)
            System.out.println(p.data+":L:"+p.left.data+",R:"+p.right.data);
            if(p.left==null&&p.right!=null)
            System.out.println(p.data+":L:"+"-1"+",R:"+p.right.data);
            if(p.left!=null&&p.right==null)
            System.out.println(p.data+":L:"+p.left.data+",R:"+"-1");
             if(p.left==null&&p.right==null)
            System.out.println(p.data+":L:"+"-1"+",R:"+"-1");
            
            
            if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                q.add(p.right);
        }
	}
	
}
