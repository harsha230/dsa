import java.util.*;
public class Solution {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
    
	   Queue <Integer>q=new LinkedList<>();
         for(int i=0;i<input.length;i++){
            q.add(i);
        }
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<input.length;i++){
            pq.add(input[i]);
        }
        
        int ans=0;
        while(!pq.isEmpty()){
         
         if(input[q.peek()]==pq.peek()){
             if(q.peek()==k)
                 break;
             ans++;
             q.poll();
             pq.poll();
         }
         else{
             int t=q.poll();
             q.add(t);
         }   
            
        }
        return ans+1;
 
	}
}
