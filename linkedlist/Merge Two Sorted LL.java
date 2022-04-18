public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> h1, LinkedListNode<Integer> h2) {
        //Your code goes here
        if(h1==null && h2!=null ){
           	return h2;
        }
         if(h2==null && h1!=null ){
           	return h1;
        }
         if(h1==null && h2==null ){
           	return h1;
        }
        
        LinkedListNode<Integer> head,tail;
        if(h1.data>h2.data){
            head=h2;
            h2=h2.next;
        }
        else 
        { head=h1;
         h1=h1.next;}
        tail=head;
        
        while(h1!=null && h2!=null)
        {
            if(h1.data<h2.data){
               tail.next=h1;
               tail=tail.next;
               
                h1=h1.next;
            }
            else {
                tail.next=h2;
               tail=tail.next;
               
                h2=h2.next;
            }
            
            
        } 
        if(h1==null && h2!=null){
			tail.next=h2;
            
        }
        if(h2==null && h1!=null){
			tail.next=h1;
            
        }
        
        
            
        return head;
    }

}
