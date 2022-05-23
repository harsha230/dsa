*/A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. 
  Find the maximum amount of money he can loot.*/
  
  
  //recursive without dp
  public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        return helper(houses,0,houses.length);
	}
    public static int helper(int arr[],int i,int n){
        if(i>=n)
            return 0;
        int m=Integer.MIN_VALUE;
        m=Math.max(arr[i]+helper(arr,i+2,n),helper(arr,i+1,n));
        
        return m;
    }

//iterative with dp
public class Solution {

	public static int maxMoneyLooted(int[] arr) {
		//Your code goes here
         if(arr.length==0)
            return 0;
        int dp[]=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],dp[0]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
      }
        return dp[dp.length-1];
	}
   
}
  
