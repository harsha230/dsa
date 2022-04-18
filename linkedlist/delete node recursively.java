public class Solution {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head==null || pos<0)
            return head;
        else {
            if(pos==0){
                
                head=head.next;
                return head;
                
            }
            head.next=deleteNodeRec(head.next,pos-1);
            return head;
        }
        
        
        
            
	}

}
