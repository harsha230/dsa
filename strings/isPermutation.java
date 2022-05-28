public class Solution {
     public static boolean isPermutation(String str1, String str2) {
		//Your code goes here]
       char[] ch=new char[256];
        for(int i=0;i<str1.length();i++){
				ch[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
				ch[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(ch[i]!=0)
                return false;
        }
        return true;
	}
}
