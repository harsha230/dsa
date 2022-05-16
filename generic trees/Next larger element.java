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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
	      
        if(root==null)
            return null;
		TreeNode<Integer> a=null;
        if(root.data>n){
            a=root;
        }
            
        for(int i=0;i<root.children.size();i++){
           	TreeNode<Integer> b =findNextLargerNode(root.children.get(i),n);
            if(b!=null){
                if(a==null||a.data>b.data){
                    a=b;
                }
            }
         }
         
        return a;
	}
	
}
