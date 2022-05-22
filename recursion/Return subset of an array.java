public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
     return subsetshelper(input,0);
	}
    public static int[][] subsetshelper(int input[],int bi) {
		// Write your code here
     if(bi==input.length){
         return new int[1][0];
     }
     int[][] smalloutput=subsetshelper(input,bi+1);
     int[][] output=new int[smalloutput.length*2][];
        int in=0;
     for(int i=0;i<smalloutput.length;i++){
         output[in]=smalloutput[i];
         in++;
     }
     for(int i=0;i<smalloutput.length;i++){
         output[in]=new int[smalloutput[i].length+1];
         output[in][0]=input[bi];
    for(int j=0;j<smalloutput[i].length;j++){
         output[in][j+1]=smalloutput[i][j];
       
     }
         in++;
     }
      return output;  
        
	}
}

