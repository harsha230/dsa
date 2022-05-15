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
      public static void rt(BinaryTreeNode<Integer> root, int k,String s) {
          if(root==null){
     	return ;
          }
          if(root.left==null && root.right==null){
              if(root.data==k){
                  System.out.println(s+root.data+" ");
                  
              } 
              return ;
          }
         
           rt(root.left,k-root.data,s+root.data+" ");
           rt(root.right,k-root.data,s+root.data+" ");
          
          
          
          
      }


	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String s="";
        rt(root,k,s);
	}

}
