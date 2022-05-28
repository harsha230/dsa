Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome


public class Solution {
	public static String reverseWordWise(String str) {
		// Write your code here
        String ans="";
        int c=0,i=0;
        
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
				int e=i-1;
                String rev="";
                for(int j=c;j<=e;j++){
                    rev=rev+str.charAt(j);
                }
                c=i+1;
                ans=rev+" "+ans;
                
            }
        }
       int e=i-1;
        String rev="";
        for(int j=c;j<=e;j++){
                    rev=rev+str.charAt(j);
                }
                c=i+1;
                ans=rev+" "+ans;
        return ans;        

	}
}

