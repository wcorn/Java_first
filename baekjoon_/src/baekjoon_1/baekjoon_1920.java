package baekjoon_1;
import java.io.*;
public class baekjoon_1920{
	static int[] n1;
	static int[] n1_copy;
	static int[] n2;
	static boolean binarySearch(int n) {
		int left = 0;
        int right = n1.length-1; 
        
        	while (left <= right) {
        		int mid = (left + right) / 2;
        		if(n1[mid]==n) {
        			return true;
        		}
        		if(n1[mid]<n) {
        			left = mid+1;
        		}
        		else {
        			right = mid-1;
        		}
        	}
        	return false;
	}
	static void merge(int left,int mid, int right) {
		int i, j, k, l;
		  i = left;
		  j = mid+1;
		  k = left;
		  while(i<=mid && j<=right){
		    if(n1[i]<=n1[j])
		    	n1_copy[k++] = n1[i++];
		    else
		    	n1_copy[k++] = n1[j++];
		  }

		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	n1_copy[k++] = n1[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	n1_copy[k++] = n1[l];
		  }

		  for(l=left; l<=right; l++){
			  n1[l] = n1_copy[l];
		  }
		}
	public static void merge_sort(int left, int right){
		  int mid;
		  if(left<right){
		    mid = (left+right)/2;
		    merge_sort(left, mid);
		    merge_sort(mid+1, right);
		    merge(left, mid, right);
		  }
		}
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int num_1 = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] str2 = str.split(" ");
        n1 = new int[num_1];
        for(int i=0; i<num_1;i++) {
        	n1[i] = Integer.parseInt(str2[i]);
        }
        n1_copy = new int[num_1];
        merge_sort(0,num_1-1);
        int num_2 = Integer.parseInt(br.readLine());
        str = br.readLine();
        str2 = str.split(" ");
        n2 = new int[num_2];
        for(int i=0; i<num_2;i++) {
        	n2[i] = Integer.parseInt(str2[i]);
        }
        for(int i=0;i<num_2;i++) {
        	if (binarySearch(n2[i])) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}