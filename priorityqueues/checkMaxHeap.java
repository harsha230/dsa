public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
         if(arr.length==0)
              return true;
           if(arr.length==1)
              return true;

     for(int i=0;i<arr.length;i++){
        if(2*i+1<arr.length){
               if(arr[i]<arr[2*i+1])
                  {
                      return false; 
                  }
              }
         if(2*i+2<arr.length){
             if( arr[i]<arr[2*i+2]){
                     return false;
             } 
            }
          }
    return true;
	}
}
