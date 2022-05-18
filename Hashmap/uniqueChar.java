import java.util.HashMap;
import java.util.*;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
         HashMap<Character,Boolean> h=new HashMap<>();
         String s="";
         for(int i=0;i<str.length();i++){
             if(h.containsKey(str.charAt(i)))
                 continue;
             s=s+str.charAt(i);
             h.put(str.charAt(i),true);
         }
 			return s;
	}
}
