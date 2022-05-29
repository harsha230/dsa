import java.util.ArrayList;


public class solution {

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

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here
        if(root==null)
            return false;
        return ((depth(root,p)==depth(root,q))&&(!isSibling(root,p,q)));

	}
    public static int depth(BinaryTreeNode<Integer> root, int p){
        if(root==null){
            return -1;
        }
        if(p==root.data){
            return 0;
        }
        int l=depth(root.left,p);
        if(l!=-1){
            return l+1;
        }
        else{
            int r=depth(root.right,p);
            if(r!=-1){
                return r+1;
            }
            else
                return -1;
        }
    }
    public static boolean isSibling(BinaryTreeNode<Integer> root, int p, int q){
        
        if(root==null)
            return false;
        if(root.left!=null && root.right !=null){
            if(root.left.data==p && root.right.data==q){
                return true;
            }
            else if(root.left.data==q && root.right.data==p)
                return true;
            else 
                return isSibling(root.left,p,q)||isSibling(root.right,p,q);
        }
        if(root.right!=null)
            return isSibling(root.right,p,q);
        else
            return isSibling(root.left,p,q);
        
        
        
        
        
    }
}
