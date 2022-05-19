import java.util.*;
public class Solution {

	public static int kthLargest(int n, int[] arr, int k) {
		// Write your code here
          if(arr.length==0)
            return Integer.MIN_VALUE;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
             pq.poll();
             pq.add(arr[i]);   
            }
        }

        
        return pq.poll();

	}
}
