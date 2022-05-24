/*You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character*/
bottom up approach
public class Solution {

	public static int editDistance(String s1, String s2) {
		//Your code goes here\
       int m=s1.length();
       int n=s2.length();
       if(m==0 && n==0)
           return 0;
       if(m==0)
           return n;
       if(n==0)
           return m;
       int dp[][]=new int[m+1][n+1];  
        int j=0;
       for(int i=n;i>=0;i--){
           dp[m][j]=i;
           j++;
       }
       j=0;
       for(int i=m;i>=0;i--){
            dp[j][n]=i;
           j++;
       }
          
       for(int i=m-1;i>=0;i--){
            
           for( j=n-1;j>=0;j--){
                int ans; 
               if(s1.charAt(i)==s2.charAt(j))
               {
                   ans=dp[i+1][j+1];
               }
               else{
                   ans=1+Math.min(Math.min(dp[i+1][j],dp[i][j+1]),dp[i+1][j+1]);
               }
               dp[i][j]=ans;
               }
           
       }
       return dp[0][0];
    }

}

/memoization//

 // public class Solution {
 //     public static int editDistance(String s1, String s2){
 //         int m=s1.length();
 //         int n=s2.length();
 //         int storage	[][]=new int [m+1][n+1];
 //         for(int i=0;i<=m;i++){
 //             for(int j=0;j<=n;j++){
 //                 storage[i][j]=-1;
 //             }
 //         }
 //         return editDistance(s1,s2,storage);
 //     }
 //     private static int editDistance(String s1,String s2,int storage[][]){
 //         int m=s1.length();
 //         int n=s2.length();
 //         if(m==0 && n==0){
 //             storage[m][n]=0;
 //             return storage[m][n];}
 //         if(m==0){
 //             storage[m][n]=n;
 //             return storage[m][n];}
 //         if(n==0){
 //             storage[m][n]=m;
 //             return storage[m][n];}
 //         if(storage[m][n]!=-1)
 //             return storage[m][n];
 //         else{
 //             if(s1.charAt(0)==s2.charAt(0))
 //                 return editDistance(s1.substring(1),s2.substring(1),storage);
 //             else{
 //                 //insert
 //                 int op1=editDistance(s1,s2.substring(1),storage);
 //                 //delete
 //                 int op2=editDistance(s1.substring(1),s2,storage);
 //                 //sustitute
 //                 int op3=editDistance(s1.substring(1),s2.substring(1),storage);
 //                 storage[m][n]=1+Math.min(op1,Math.min(op2,op3));
 //             }

 //         }
 //         return storage[m][n];
 //     }
 // }




 //Dp top bottom /////////////////////////////////////////////////////////////////
 public class Solution {
    public static int editDistance(String s1, String s2){
        int m=s1.length();
        int n=s2.length();
        if(m==0 && n==0)
            return 0;
        if(m==0)
            return n;
        if(n==0)
            return m;
        int storage[][]=new int[m+1][n+1];
        storage[0][0]=0;
        for(int i=1;i<=n;i++)
            storage[0][i]=i;
        for(int i=1;i<=m;i++)
            storage[i][0]=i;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(m-i)==s2.charAt(n-j))
                {
                    storage[i][j]=storage[i-1][j-1];
                }
                else{
                    storage[i][j]=1+Math.min(Math.min(storage[i-1][j],storage[i][j-1]),storage[i-1][j-1]);
                }
                }
        }
        return storage[m][n];
    }
 }





