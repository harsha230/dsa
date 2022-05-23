/*
	Note:
	To get all the test cases accepted, make recursive calls in following order: Top, Down, Left, Right.
	This means that if the current cell is (x, y), then order of calls should be: top cell (x-1, y), 
	down cell (x+1, y), left cell (x, y-1) and right cell (x, y+1).
*/  

public class Solution {


	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
       int p=maze.length;
       int[][] path=new int[p][p];
       solvemaze(maze,0,0,path,n); 
	}
    
    public static void solvemaze(int mat[][],int i,int j,int path[][],int n){
      
        if(i>=n || j>=n||i<0||j<0||mat[i][j]==0||path[i][j]==1){
            return ;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++)
                {  System.out.print(path[r][c]+" ");
                  }
              
            }
            System.out.println(); 
            path[i][j]=0;
            return ;
            
        }
        //top
        solvemaze(mat,i-1,j,path,n);
         //down
        solvemaze(mat,i+1,j,path,n);
        
        //left
        solvemaze(mat,i,j-1,path,n);
        //right
        solvemaze(mat,i,j+1,path,n);
       
        path[i][j]=0;
        return ;
        
    }



	

}
