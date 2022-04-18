public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        LinkedListNode<Integer> cur=head;
        LinkedListNode<Integer> prev=null;
        
        while(cur!=null){
            head=head.next;
            cur.next=prev;
            prev=cur;
            cur=head;
        }
        head=prev;
        return head;
	}
}
