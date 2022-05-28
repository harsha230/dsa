/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(k==0)
            return head;
        LinkedListNode<Integer> curr=head,next=null,prev=null;
        int count=0;
        while(curr!=null&&count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
           LinkedListNode<Integer> rest_head=kReverse(next,k);
            head.next=rest_head;
        }
        return prev;
        
	}

}
