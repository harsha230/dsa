import java.util.*;

public class Solution {
	public static int PairSum(int[] arr, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        int c=0;
        
         HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(-arr[i])){
                c=c+h.get(-arr[i]);
            }
             if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
                }
            else
                h.put(arr[i],1);
             
        }
        return c;
        
        
        
        
	}
}
