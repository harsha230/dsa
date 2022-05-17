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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        custom c= fs(root);
         
        return c.sm;

	}
    public static custom  fs(TreeNode<Integer> root){
         
        custom a=new custom(root,null);
        for(int i=0;i<root.children.size();i++){
           	custom b =fs(root.children.get(i));
            custom c= new custom(null,null);
            if(b.m!=null){
                if(a.m.data==b.m.data){
                    
                }
                if(a.m.data<b.m.data){
                    c.m=a.m;
                    a.m=b.m;
                    if(a.sm==null){
                        a.sm=c.m;
                    }
                    else{
                        if(c.m.data>a.sm.data){
                            a.sm=c.m;
                        }
                    }
                }
                else {
                    if(a.sm==null && b.m.data!=a.m.data ){
                        a.sm=b.m;
                    }
                    
                }
                if(b.sm!=null){
                if(a.sm==null ){
                    a.sm=b.sm;
                }
                else if(b.sm.data>a.sm.data && b.sm.data!=a.m.data){
                    a.sm=b.sm;
                }}
                
            }
            
         }
        return a;
        
    }
	
	
}
 class custom {
    TreeNode<Integer> m;
    TreeNode<Integer> sm;
    custom(TreeNode<Integer> m,TreeNode<Integer> sm){
    this.m=m;
    this.sm=sm;
    }
}

