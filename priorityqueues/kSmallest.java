import java.util.ArrayList;
import java.util.*;
class MaxHeap
  {
    int[] harr; 
    int capacity; 
    int heap_size;
 
   public  int parent(int i) { return (i - 1) / 2; }
    public  int left(int i) { return (2 * i + 1); }
   public  int right(int i) { return (2 * i + 2); }
   public  int getMax() { return harr[0]; } 
   public  void replaceMax(int x)
    {
      this.harr[0] = x;
      maxHeapify(0);
    }
  MaxHeap(int a[],int size)
    {
      heap_size = size;
      harr = a; 
      int i = (heap_size - 1) / 2;
      while (i >= 0)
      {
        maxHeapify(i);
        i--;
      }
    }
 
   public int extractMax()
    {
      if (heap_size == 0)
        return Integer.MAX_VALUE;
      int root = harr[0];
      if (heap_size > 1)
      {
        harr[0] = harr[heap_size - 1];
        maxHeapify(0);
      }
      heap_size--;
      return root;
    }
   public  void maxHeapify(int i)
    {
      int l = left(i);
      int r = right(i);
      int largest = i;
      if (l < heap_size && harr[l] > harr[i])
        largest = l;
      if (r < heap_size && harr[r] > harr[largest])
        largest = r;
      if (largest != i)
      {
        int t = harr[i];
        harr[i] = harr[largest];
        harr[largest] = t;
        maxHeapify(largest);
      }
    }
  }
public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		// Write your code here
    MaxHeap mh = new MaxHeap(arr,k);
    for (int i = k; i < n; i++)
      if (arr[i] < mh.getMax())
        mh.replaceMax(arr[i]);
	
    ArrayList<Integer> a= new ArrayList<Integer>();
    for(int i=0;i<k;i++){
        a.add(mh.extractMax());
    }
    return a;
    }
}
