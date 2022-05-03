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
        BinaryTreeNode<Integer> r=new BinaryTreeNode<Integer>(-1);
        q.add(r);
        while(!q.isEmpty()){
			BinaryTreeNode<Integer> p=q.poll();
            if(p==r){
      
                 System.out.println();
                    q.add(r);
                 if(q.size()==1)
                     break;
                continue;
            }
            System.out.print(p.data+" ");
            if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                q.add(p.right);
        }
	}
	
}
