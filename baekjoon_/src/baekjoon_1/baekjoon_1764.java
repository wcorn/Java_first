package baekjoon_1;
import java.io.*;
public class baekjoon_1764 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String[] lis;
	static String[] see;
	static String[] copy;
	static int count=0;
	static boolean binarySearch(String str,String[] mis) {
		int left=0;
		int right = mis.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(mis[mid].equals(str)) {
				count++;
				return true;
			}
			if(mis[mid].compareTo(str)<0) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return false;
	}
	static void merge(int left, int mid, int right, String[] str) {
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;	
		while(i<=mid && j<=right){
		    if(str[i].compareTo(str[j])<=0)
		    	copy[k++] = str[i++];
		    else
		    	copy[k++] = str[j++];
		  }
		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	copy[k++] = str[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	copy[k++] = str[l];
		  }

		  for(l=left; l<=right; l++){
			  str[l] = copy[l];
		  }
	}
	static void merge_sort(int left, int right,String[] str)  {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			merge_sort(left,mid,str);
			merge_sort(mid+1,right,str);
			merge(left,mid,right,str);
		}
	}
	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int n1 = Integer.parseInt(str2[0]);
		int n2 = Integer.parseInt(str2[1]);
		lis = new String[n1];
		see = new String[n2];
		int n3 = Math.max(n1, n2);
		copy = new String[n3];
		for(int i=0;i<n1;i++) {
			lis[i] = br.readLine();
		}
		for(int i=0;i<n2;i++) {
			see[i] = br.readLine();
		}
		if(n3==n2) {
			merge_sort(0,n1-1,lis);
			for(int i=0;i<n1;i++) {
				if(binarySearch(lis[i],see)) {
					sb.append(lis[i]+"\n");
				}
			}
		}
		else {
			merge_sort(0,n2-1,see);
			for(int i=0;i<n2;i++) {
				if(binarySearch(see[i],lis)) {
					sb.append(see[i]+"\n");
				}
			}
		}
		bw.write(Integer.toString(count)+"\n");
		bw.write(sb.toString());
		bw.flush();
	}
}
