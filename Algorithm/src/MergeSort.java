public class MergeSort {
	private String[] arr;
	private String[] arr_copy;
	public MergeSort(String[] num)
	{
		arr = num;
		arr_copy = new String[arr.length];
	}
	public void sort()
	{
		merge_sort(0,arr.length-1);
	}
	private void merge_sort(int left, int right)
	{
		int mid;
		if(right>left) {
			mid = (left+right)/2;
			merge_sort(left,mid);
			merge_sort(mid+1,right);
			merge(left,mid,right);
		}
	}
	private void merge(int left, int mid, int right)
	{
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;
		while(i<=mid && j<=right){
		    if(arr[i].compareTo(arr[j])<=0)
		    	arr_copy[k++] = arr[i++];
		    else
		    	arr_copy[k++] = arr[j++];
		  }
 
		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	arr_copy[k++] = arr[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	arr_copy[k++] = arr[l];
		  }

		  for(l=left; l<=right; l++){
			  arr[l] = arr_copy[l];
		  }
	}
}
