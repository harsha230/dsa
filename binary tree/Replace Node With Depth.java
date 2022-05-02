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
    public static void replaceNode(BinaryTreeNode<Integer> node, int level)
   {
    // Base Case
    if (node == null)
        return;
 
    // Replace data with current depth
    node.data = level;
 
    replaceNode(node.left, level+1);
    replaceNode(node.right, level+1);
    }
 
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
        
        replaceNode(root,0);
        
	}

}
