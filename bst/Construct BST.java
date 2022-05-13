public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			    return STBST(arr,0,arr.length-1);
		}
        public static BinaryTreeNode<Integer> STBST(int[] arr,int si,int ei){
       
        if(si>ei)
            return null;
      
             if(arr.length==0)
             return null;
         if(arr.length==1)
         {
             BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[0]);
               return root;
         }
        int mid=(ei+si)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
     
        root.left=STBST(arr,si,mid-1);
        root.right=STBST(arr,mid+1,ei);
        return root;


    }
       
	}
