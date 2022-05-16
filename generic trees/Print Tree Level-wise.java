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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		
		pendingNodes.enqueue(root);
       pendingNodes.enqueue(null);
        System.out.println(root.data);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
                if(currentNode==null){
                    System.out.println();
                    if(!pendingNodes.isEmpty()){
                         pendingNodes.enqueue(null);
                    }
                }
				else{
				for(int i = 0 ; i < currentNode.children.size(); i++){
					
					System.out.print(currentNode.children.get(i).data+" ");
					pendingNodes.enqueue(currentNode.children.get(i));
					
				}}
    
			} catch (QueueEmptyException e) {
			}
		}
		
	
        
        

	}
		
}

