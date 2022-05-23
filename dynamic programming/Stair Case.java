public class Solution {

	public static long staircase(int n) {
		//Your code goes here
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            long a=0,b=0,c=0;
            a=dp[i-1];
            b=dp[i-2];
            if(i-3>=0){
             c=dp[i-3];
            }
            dp[i]=a+b+c;
            
        }
        return dp[n];
	}}
   
