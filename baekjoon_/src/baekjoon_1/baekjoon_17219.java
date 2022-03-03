package baekjoon_1;
import java.io.*;
public class baekjoon_17219 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String[][] in_1;
	static String[][] copy;
	static int n1;
	static int n2;
	static void merge(int left, int mid, int right) {
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;
		while(i<=mid && j<=right) {
			if(in_1[i][0].compareTo(in_1[j][0])<0)
		    	copy[k++] = in_1[i++];
		    else
		    	copy[k++] = in_1[j++];
		}
		if(i>mid){
		    for(l=j; l<=right; l++)
		    	copy[k++] = in_1[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	copy[k++] = in_1[l];
		  }

		  for(l=left; l<=right; l++){
			  in_1[l] = copy[l];
		  }
			
	}
	static void merge_sort(int left,int right) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			merge_sort(left,mid);
			merge_sort(mid+1,right);
			merge(left,mid, right);
			}
	}
	static String binarySearch(String s) {
		int left = 0;
		int right = n1-1;
		int mid=0;
		while(left<right) {
			mid = (left+right)/2;
			if(in_1[mid][0].compareTo(s)==0) {
				return in_1[mid][1];
			}
			if(in_1[mid][0].compareTo(s)<0) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return in_1[left][1];
	}
	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		String[] str2 = str.split(" ");
		n1 = Integer.parseInt(str2[0]);
		n2 = Integer.parseInt(str2[1]);
		in_1 = new String[n1][2];
		copy = new String[n1][2];
		for(int i=0;i<n1;i++) {
			String n = br.readLine();
			in_1[i] = n.split(" ");
		}
		merge_sort(0,n1-1);
		for(int i=0;i<n2;i++) {
			String ni = br.readLine();
			sb.append(binarySearch(ni)+"\n");
		}
		bw.append(sb.toString());
		bw.flush();
	}
}
