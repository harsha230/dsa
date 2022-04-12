import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {

            LinkedListNode<Integer> head = takeInput(); 

            boolean ans = Solution.isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }
}
public class Solution {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        
         LinkedListNode<Integer>cur=head,prev=null;
        while(cur!=null){
            head=cur.next;
            cur.next=prev;
            prev=cur;
            cur=head;
        }
         head=prev;
        LinkedListNode<Integer>temp=head;
        int l=length(head);
        
        return head;
    
    }
    
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
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null)
            return true;
        if(head.next==null)
            return true;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> p=new LinkedListNode<Integer>(temp.data);
        LinkedListNode<Integer> o=p;
        while(temp.next!=null){
			temp=temp.next;
            LinkedListNode<Integer> t=new LinkedListNode<Integer>(temp.data);
            p.next=t;
            p=t;
        }
        p.next=null;
        
        LinkedListNode<Integer> h=reverse(o);
        int l=length(head);
        int f=0;
        LinkedListNode<Integer> te=head;
        for(int i=0;i<l;i++){
            if(te.data != h.data){
                return false ;
            }
            te=te.next;
            h=h.next;
        }
        return true;
        
        
	}

}

