Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
  public class Solution {

     public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		//Your code goes here
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
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
   
        head=reverse(head);
        int carry=1,num;
        LinkedListNode<Integer> ptr=head,prev=null;
        while(ptr!=null)
        {
            num=((ptr.data)+carry)%10;
            carry=((ptr.data)+carry)/10;
            ptr.data=num;
            prev=ptr;
            ptr=ptr.next;
            
        }
        if(carry==1){
            LinkedListNode<Integer> tail=new LinkedListNode<Integer>(carry);
            prev.next=tail;
        }
        return reverse(head);
        
	}


}
