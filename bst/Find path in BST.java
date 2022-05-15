import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int x){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root==null)
            return null;
        if(root.data==x){
            ArrayList<Integer> o=new ArrayList<Integer>();
            o.add(root.data);
            return o;
        }
        if(root.data>x){
            ArrayList<Integer> l=getPath(root.left,x);
            if(l!=null){
                l.add(root.data);
                return l;
            }
            if(l==null)
                return null;
        }
         if(root.data<x){
            ArrayList<Integer> r=getPath(root.right,x);
            if(r!=null){
                r.add(root.data);
                return r;
            }
            if(r==null)
                return null;
        }
        return null;
        
	}
}
