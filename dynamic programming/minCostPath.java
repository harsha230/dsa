public class Solution {

	public static int minCostPath(int[][] input) {
		//Your code goes here
        int dp[][]=new int[input.length+1][input[0].length+1];
        for(int i=0;i<dp.length;i++){
       for(int j=0;j<dp[0].length;j++)
         dp[i][j]=Integer.MIN_VALUE;
        }
        return helper(input,0,0,dp);
	}
    
    public static int helper(int[][] arr,int i,int j,int dp[][]){
        int n=arr.length;
        int m=arr[0].length;
        if(i==n-1 && j==m-1){
            return arr[i][j];
        }
        if(i>=n|| j>=m)
            return Integer.MAX_VALUE;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        if(dp[i+1][j]==Integer.MIN_VALUE){
           a=helper(arr,i+1,j,dp);
           dp[i+1][j]=a;
        }else 
            a=dp[i+1][j];
        if(dp[i][j+1]==Integer.MIN_VALUE){
           b=helper(arr,i,j+1,dp);
           dp[i][j+1]=b;
        }else
            b=dp[i][j+1];
        if(dp[i+1][j+1]==Integer.MIN_VALUE){
           c=helper(arr,i+1,j+1,dp);
           dp[i+1][j+1]=c;
        }else 
            c=dp[i+1][j+1];
        
        return arr[i][j]+Math.min(a,Math.min(b,c));
        
    }
}
