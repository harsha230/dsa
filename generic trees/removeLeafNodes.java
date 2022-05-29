import java.util.*;
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

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(root==null || root.children.size()==0){
            return null;
        }
        
        
        ArrayList<Integer> in=new ArrayList<Integer>();
        for(int i=0;i<root.children.size();i++){
             TreeNode<Integer> c=root.children.get(i);
            if(c.children.size()==0){
                in.add(i);
            }
            
        }
        for(int i=in.size()-1;i>=0;i--){
            int j=in.get(i);
            root.children.remove(j);
        }
        for(int i=0;i<root.children.size();i++){
             TreeNode<Integer> ch=removeLeafNodes(root.children.get(i));
            if(ch==null){
                root.children.remove(i);
            }
        }
        return root;
	}
}
