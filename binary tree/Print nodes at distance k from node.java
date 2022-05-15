
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
    public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int target, int k){
        if(root==null){
            return -1;
        }
        if(root.data==target){
            nodesAtKDistanceDown(root,k);
            return 0;
        }
        int leftD=nodesAtDistanceKHelper(root.left,target,k);
        if(leftD!=-1){
            if(leftD+1==k){
                System.out.println(root.data);
            }
            else{
                nodesAtKDistanceDown(root.right,k-leftD-2);
            }
            return 1+leftD;
        }
        int rightD=nodesAtDistanceKHelper(root.right,target,k);
        if(rightD!=-1){
            if(rightD+1==k){
                System.out.println(root.data);
            }
            else{
                nodesAtKDistanceDown(root.left,k-rightD-2);
            }
            return 1+rightD;
        }
        return -1;
    }

	public static void nodesAtKDistanceDown(BinaryTreeNode<Integer> root, int k) {
	    //Your code goes here
         if(root==null)
             return;
        if(k==0){
            System.out.println(root.data);
            return;
        }
        nodesAtKDistanceDown(root.left,k-1);
        nodesAtKDistanceDown(root.right,k-1);
        
	}
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k){
        nodesAtDistanceKHelper(root,node,k);
    }

}
