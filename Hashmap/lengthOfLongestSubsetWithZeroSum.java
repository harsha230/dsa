import java.util.*;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
        HashMap<Integer,Integer> h= new HashMap<>();
        int ps=0,res=0;
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            if(ps==0){
                res=i+1;
            }
            if(h.containsKey(ps)){
                res=Math.max(res,i-h.get(ps));
            }
            h.put(ps,i);
                
            
        }
        return res;
	}
}
