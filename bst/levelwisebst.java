import java.util.ArrayList;
import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if(root==null)
        {
            return new ArrayList<LinkedListNode<Integer>>();
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        ArrayList<LinkedListNode<Integer>> ans=new ArrayList<LinkedListNode<Integer>>();
        LinkedListNode<Integer> newList=null,newTail=null;
        while(!pendingNodes.isEmpty())
        {
            BinaryTreeNode<Integer> frontNode= pendingNodes.poll();
            if(frontNode==null)
            {
                newList=null;
                newTail=null;
                if(!pendingNodes.isEmpty())
                    pendingNodes.add(null);
            }
            else
            {
                if(newList==null)
                {
                    newList=new LinkedListNode<Integer>(frontNode.data);
                    newTail=newList;
                    ans.add(newList);
                }
                else
                {
                    newTail.next= new LinkedListNode<Integer>(frontNode.data);
                    newTail=newTail.next;
                }
                if(frontNode.left!=null){
                pendingNodes.add(frontNode.left);
                }
                if(frontNode.right!=null){
                    pendingNodes.add(frontNode.right);
                }
            }
            
        }
        return ans;
		// Write your code here
	}

}
