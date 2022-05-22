public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
         return helper(input,k,0);

	}
     public static int[][] helper(int input[], int k,int si) {
         if(si==input.length)
         {
             if(k==0)
                 return new int[1][0];
             else
                 return new int[0][0];
         }
     int op1[][]=helper(input,k,si+1);
     int op2[][]=helper(input,k-input[si],si+1);
     
     int output[][]=new int[op1.length+op2.length][];
     int l=0;
     for(int i=0;i<op1.length;i++){
         output[l]=op1[i];
         l++;
     }
     for(int i=0;i<op2.length;i++){
         output[l]=new int[op2[i].length+1];
         output[l][0]=input[si];
         for(int j=0;j<op2[i].length;j++){
             output[l][j+1]=op2[i][j];
         }
       l++;
     }
         return output;}
}
