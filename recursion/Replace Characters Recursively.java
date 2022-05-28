public class Solution {

	public static String replaceCharacter(String st, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
         if(st.length()==0)
            return st;
        String p=replaceCharacter(st.substring(1),c1,c2);
        if(st.charAt(0)==c1)
            return c2+p;
        else 
            return st.charAt(0)+p;

	}
}

