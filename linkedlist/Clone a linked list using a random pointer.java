 public static Node clone(Node head) 
    { 
        HashMap<Node,Node> hm=new HashMap<Node,Node>();
        for(Node curr=head;curr!=null;curr=curr.next)
            hm.put(curr,new Node(curr.data));
        
        for(Node curr=head;curr!=null;curr=curr.next){
            Node cloneCurr=hm.get(curr);
            cloneCurr.next=hm.get(curr.next);
            cloneCurr.random=hm.get(curr.random);
        }
        Node head2=hm.get(head);
        
        return head2;
    }
method 2
public static Node clone(Node head) 
    { 
        Node next,temp;
        for(Node curr=head;curr!=null;){
            next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(Node curr=head;curr!=null;curr=curr.next.next){
            curr.next.random=(curr.random!=null)?(curr.random.next):null;
        }
        
         Node original = head, copy = head.next; 
      
        temp = copy; 
      
        while (original!=null && copy!=null) 
        { 
            original.next = 
             original.next!=null? original.next.next : original.next; 
      
            copy.next = copy.next!=null?copy.next.next:copy.next; 
            original = original.next; 
            copy = copy.next; 
        } 
      
        return temp;
    }

