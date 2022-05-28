public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String ans="";
        char ch;
        int i;
        for(i=0;i<str.length()-1;i++){
            ch=str.charAt(i);
            if(ch!=str.charAt(i+1)){
                ans+=ch; 
            }
        }
        ans+=str.charAt(i);
        return ans;
	}

}
