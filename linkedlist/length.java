public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        LinkedListNode<Integer> t=head;
        int l=0;
        
        while(t!=null){
            l++;
            t=t.next;
        }
        return l;
	}
}
