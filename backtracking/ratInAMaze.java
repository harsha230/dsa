public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
       int n=maze.length;
       int[][] path=new int[n][n];
       return solvemaze(maze,0,0,path); 
	}
    
    public static boolean solvemaze(int mat[][],int i ,int j,int path[][]){
        int n=mat.length;
        if(i>=n || j>=n||i<0||j<0||mat[i][j]==0||path[i][j]==1){
            return false;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            return true;
        }
        //top
        if(solvemaze(mat,i-1,j,path)){
            return true;
        }
        //right
        if(solvemaze(mat,i,j+1,path)){
            return true;
        }
        //down
        if(solvemaze(mat,i+1,j,path)){
            return true;
        }
        //left
        if(solvemaze(mat,i,j-1,path)){
            return true;
        }
        return false;
        
    }
}

