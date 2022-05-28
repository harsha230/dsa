Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
import java.util.*;
public class solution {

	public static boolean splitArray(int arr[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        return splitArray(arr,0,0,0);
	}
     private static boolean splitArray(int input[] ,int si,int lsum ,int rsum){
         if(input.length == si){
             return  lsum==rsum;
         }

          if(input[si] % 3 == 0){
                 lsum += input[si];
             }else if(input[si] % 5 == 0){
                 rsum += input[si];
             }else{
                return splitArray(input,si+1,lsum+input[si],rsum) || splitArray(input,si+1,lsum,rsum+input[si]) ;
             }

         return splitArray(input,si+1,lsum,rsum) ;



     }
	

}
