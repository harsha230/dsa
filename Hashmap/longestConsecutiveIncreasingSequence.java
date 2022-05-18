import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;


public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        Set <Integer> h=new HashSet<>();
         ArrayList<Integer> o=new  ArrayList<Integer>();
        for(Integer x:arr){
	    h.add(x); 
        }
        int res=1;
        Integer s=0;
        
        for(Integer x:h){
            if(h.contains(x-1)==false){
                int c=1;
                while(h.contains(x+c))
                    c++;
                res=Math.max(res,c);
                if(res==c)
                    s=x;
            }    
        }
        o.add(s);
        o.add(s+res-1);
        return o;
        
    }
}
