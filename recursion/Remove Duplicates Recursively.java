public class Solution {

	public static String removeConsecutiveDuplicates(String st) {
		// Write your code here

        if(st.length()<=1)
            return st;
        String p;
        if(st.charAt(0)==st.charAt(1))
        {   int n=1;
             for(int i=1;i<st.length()-1;i++){
                 if(st.charAt(0)==st.charAt(i+1))
                     n++;
                 if(st.charAt(0)!=st.charAt(i+1))
                     break;
             }
            return st.charAt(0)+removeConsecutiveDuplicates(st.substring(n+1));}
        
        else 
            return st.charAt(0)+removeConsecutiveDuplicates(st.substring(1));
	}

}
