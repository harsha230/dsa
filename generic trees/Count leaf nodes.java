public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
      int m=0;
        if(root==null)
            return 0;
        for(int i=0;i<root.children.size();i++){
             m+=countLeafNodes(root.children.get(i));
        }
        
        if(root.children.size()==0)
           return 1+m;
        else
           return m;
        

	}
	
}

