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
	
	static class maxpair<T>{
        TreeNode<Integer> node;
        T sum;
        maxpair(TreeNode<Integer> node, T sum){
            this.node=node;
            this.sum=sum;
        }
        
    }
    public static maxpair<Integer> ms(TreeNode<Integer> root){
        if(root==null){
             maxpair<Integer> pair=new  maxpair<Integer>(null,Integer.MIN_VALUE);
            return pair;
        }
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
         maxpair<Integer> ans=new  maxpair<Integer>(root,sum);
        for(int i=0;i<root.children.size();i++){
          maxpair<Integer> out=ms(root.children.get(i));
          if(out.sum>ans.sum){
              ans=out;
          }  
        }
        return ans;
        
    }
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here\
        return ms(root).node;
	}
	
		
}

