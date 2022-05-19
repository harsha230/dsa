public class Solution {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		int n = arr.length; 

		buildheap(arr,n); 
 
		for (int i=n-1; i>0; i--) 
		{ 
			 
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 

			heapify(arr, i, 0); 
		}}
    public static void buildheap(int arr[],int n){
        for (int i = n / 2 - 1; i >= 0; i--) 
		    heapify(arr, n, i);
    }
   public static void heapify(int arr[], int n, int i) 
	{ 
		int largest = i;  
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		if (l < n && arr[l] < arr[largest]) 
			largest = l; 
 
		if (r < n && arr[r] < arr[largest]) 
			largest = r; 

		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			heapify(arr, n, largest); 
		} 
	} 
    
	}
