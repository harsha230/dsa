import java.util.*;
public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(h.containsKey(arr1[i])){
                h.put(arr1[i],h.get(arr1[i])+1);
            }
            else
                h.put(arr1[i],1);
        }
         for(int i=0;i<arr2.length;i++){
            if(h.containsKey(arr2[i])){
               if(h.get(arr2[i])!=0){
                
                    System.out.println(arr2[i]);
                    h.put(arr2[i],h.get(arr2[i])-1);
                    }
            }
            else
                continue;
        }
        
          
	}
}
