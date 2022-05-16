public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
 
	   int sum=0,s=0;
        if(root==null)
            return 0;
        for(int i=0;i<root.children.size();i++){
             s+=numNodeGreater(root.children.get(i),x);
          
        }
       if(root.data>x)
        return s+1;
        else
            return s;
	}
	
	
}

