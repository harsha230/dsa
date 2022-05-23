/*Whis and Beerus are playing a new game today. They form a tower of N coins and make a move in alternate turns. Beerus plays first. In one step, the player can remove either 1, X, or Y coins from the tower. 
The person to make the last move wins the game. Can you find out who wins the game?*/
public class Solution {

	public static String findWinner(int n, int x, int y) {
		//Your code goes here
	  int dp [] = new int[n+1];

        dp[1] = 1;

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for(int i=2;i<dp.length;i++){
            if(i == x || i == y){
                dp[i] = 1;
                continue;
                
            }

            if(i-x >= 1){
                a1 = dp[i-x] ^ 1;
            }
            if(i-y >= 1){
                a2 = dp[i-y] ^ 1;
            }

            a3 = dp[i-1] ^ 1;

            dp[i] = Math.max(a1 ,Math.max(a2 ,a3));
        }

        if(dp[n] != 0){
            return "Beerus";
        }else{
             return "Whis";
        }
		
	}

}
