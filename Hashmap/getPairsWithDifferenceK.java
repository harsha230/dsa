import java.util.*;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here   int c=0;
        
        int c=0;
    
        
         HashMap<Integer,Integer> h=new HashMap<>();
        if(k==0){
            for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                c=c+h.get(arr[i]);
            }
             if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
                }
            else
                h.put(arr[i],1);
             
        }
        }
        else{
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(k+arr[i])){
                c=c+h.get(k+arr[i]);
            }
            if(h.containsKey(arr[i]-k)){
                 c=c+h.get(arr[i]-k);
            }
             if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
                }
            else
                h.put(arr[i],1);
             
        }}
        return c;
        
	}
}
