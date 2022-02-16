package baekjoon_1;
import java.io.*;
public class baekjoon_10814 {
	static String[][] n;
	static String[][] n_copy;
	public static void merge_sort(int left,int right) {
		int mid;
		if(right>left) {
			mid = (left+right)/2;
			merge_sort(left,mid);
			merge_sort(mid+1,right);
			merge(left,mid,right);
		}
	}
	public static void merge(int left,int mid,int right) {
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;
		int n1,n2;
		while(i<=mid && j<=right){
			n1 = Integer.parseInt(n[i][0]);
			n2 = Integer.parseInt(n[j][0]);
		    if(n1<=n2)
		    	n_copy[k++] = n[i++];
		    else
		    	n_copy[k++] = n[j++];
		  }

		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	n_copy[k++] = n[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	n_copy[k++] = n[l];
		  }

		  for(l=left; l<=right; l++){
		    n[l] = n_copy[l];
		  }
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		n = new String[num][2];
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			n[i] = str.split(" ");
		}
		n_copy = new String[n.length][2];
		merge_sort(0,num-1);
		for(int i=0;i<num;i++) {
			sb.append(n[i][0]+" "+n[i][1]);
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
