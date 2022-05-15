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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            Pair <Integer, Integer> q=new Pair <Integer, Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            return q;
        }
         Pair <Integer, Integer> lp=getMinAndMax(root.left);
        Pair <Integer, Integer> rp=getMinAndMax(root.right);
        int min=Math.min(root.data,Math.min(lp.minimum,rp.minimum));
        int max=Math.max(root.data,Math.max(lp.maximum,rp.maximum));
        return new Pair<>(min,max);
        
        
        
        
        
         
	}
	
}
