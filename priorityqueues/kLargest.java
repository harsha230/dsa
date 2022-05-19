import java.util.ArrayList;
import java.util.*;
public class Solution {

	public static ArrayList<Integer> kLargest(int arr[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		if(k>arr.length){
            return null;
        }
        ArrayList<Integer> a= new ArrayList<Integer>();
        PriorityQueue<Integer> p=new  PriorityQueue<Integer>();
        for(int i=0;i<k;i++){
            p.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(p.peek()<arr[i]){
             p.poll();
             p.add(arr[i]);   
            }
        }
        for(int i=0;i<k;i++){
            a.add(p.poll());
        }
        return a;
	}
}
