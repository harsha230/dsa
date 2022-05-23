public class Solution {
	
		
public static void placeNQueens(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
    
    int[][] board=new int[n][n];
    placeQ(board,n,0);
	}
    
    static void placeQ(int[][] board,int n,int row){
        if(row==n){
            // Valid configuration 
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
            }
             System.out.println();
        }
        
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                placeQ(board,n,row+1);
                board[row][col]=0;
            }
        }
    }
    
    static boolean isSafe(int[][] board,int row,int col){
        if(row>=board.length)
            return false;
        // Checking columns
        for(int i=0;i<col;i++){
            if(board[row][i]==1)
                return false;
        }
        // Checking rows
        for(int i=0;i<row;i++){
            if(board[i][col]==1)
                return false;
        }
        // Checking for diagonal upper left
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(int i=row,j=col;i>=0&&j<board.length;i--,j++){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
	
}
     
	
