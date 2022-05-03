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

public class Solution {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return ;
        }
        BinaryTreeNode<Integer> temp;
        if(root.left!=null){
              temp=root.left;
        BinaryTreeNode<Integer> dup=new BinaryTreeNode<Integer>(root.data);
        root.left=dup;
             dup.left=temp;}
        else{
            BinaryTreeNode<Integer> dup=new BinaryTreeNode<Integer>(root.data);
             root.left=dup;
        }
    
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
	}
	
}
