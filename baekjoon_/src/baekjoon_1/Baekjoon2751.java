package baekjoon_1;
import java.io.*;
public class Baekjoon2751 {
	public static void merge(int list[], int left, int mid, int right,int sorted[]){
		  int i, j, k, l;
		  i = left;
		  j = mid+1;
		  k = left;
		  while(i<=mid && j<=right){
		    if(list[i]<=list[j])
		      sorted[k++] = list[i++];
		    else
		      sorted[k++] = list[j++];
		  }

		  if(i>mid){
		    for(l=j; l<=right; l++)
		      sorted[k++] = list[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		      sorted[k++] = list[l];
		  }

		  for(l=left; l<=right; l++){
		    list[l] = sorted[l];
		  }
		}
	public static void merge_sort(int list[], int left, int right,int sorted[]){
		  int mid;
		  if(left<right){
		    mid = (left+right)/2;
		    merge_sort(list, left, mid,sorted);
		    merge_sort(list, mid+1, right,sorted);
		    merge(list, left, mid, right,sorted);
		  }
		}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] n = new int[num];
    	int[] sorted = new int[num];
        for(int i=0;i<num; i++) {
        	n[i] = Integer.parseInt(br.readLine());
        }
        merge_sort(n,0,num-1,sorted);
        StringBuilder ret = new StringBuilder();
		for(int i=0;i<num;i++) {
			ret.append(n[i]);
			ret.append("\n");
		}
		bw.write(ret.toString());
		bw.flush();
    }
}
