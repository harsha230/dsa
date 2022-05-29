import java.util.ArrayList;

public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            ArrayList<Integer> ans= new ArrayList<Integer>();
            ans.add(root.data);
            return ans;
        }
		ArrayList<Integer> ls=longestRootToLeafPath(root.left);
        ArrayList<Integer> rs=longestRootToLeafPath(root.right);
        if(ls==null){
            if(root!=null)
            rs.add(root.data);
            return rs;
        }
        if(rs==null){
            ls.add(root.data);
            return ls;
        }
        if(ls.size()>rs.size()){
            ls.add(root.data);
            return ls;
        }
        else{
            rs.add(root.data);
            return rs;
        }
    }

	
	
}
