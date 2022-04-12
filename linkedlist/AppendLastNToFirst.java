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
        while (i < datas.length && !datas[i].equals("-1")) {
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

            int n = Integer.parseInt(br.readLine().trim());
            head = Solution.appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }
        
    }
}
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
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(n==0){
            return head;
        }
            
        int l=length(head);
        if(n>l)
            return head;
        int s=l-n;
        int c=0;
        LinkedListNode<Integer> temp=head;
        while(c<s){
            if(temp.next!=null){
                temp=temp.next;
            }	
            c++;
        }
        LinkedListNode<Integer> nh= new LinkedListNode<Integer>(temp.data);
        LinkedListNode<Integer> d=nh;
        c=0;
        temp=temp.next;
        while(c<n-1 && temp.next!=null){
            
            LinkedListNode<Integer> g= new LinkedListNode<Integer>(temp.data);
            nh.next=g;
            nh=g;
            temp=temp.next;
            c++;    
        }
        if(temp.next==null){
            LinkedListNode<Integer> g= new LinkedListNode<Integer>(temp.data);
            nh.next=g;
            nh=g;
        }
        LinkedListNode<Integer> te=head;
        
        c=0;
        while(c<s && head.next!=null){
            
            LinkedListNode<Integer> g= new LinkedListNode<Integer>(head.data);
            nh.next=g;
            nh=g;
            head=head.next;
            c++;    
        }
        return d;
        
        
           
	}

}


