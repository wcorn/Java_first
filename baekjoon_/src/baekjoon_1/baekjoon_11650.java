package baekjoon_1;
import java.io.*;
public class baekjoon_11650 {
	static int[][] n;
	static int[][] num2;
	public static void merge(int left, int mid, int right) {
		int i, j, k, l;
		  i = left;
		  j = mid+1;
		  k = left;
		  while(i<=mid && j<=right){
		    if((n[i][0]<n[j][0])||(((n[i][0]==n[j][0])&&(n[i][1]<=n[j][1]))))
		    	num2[k++] = n[i++];
		    else
		    	num2[k++] = n[j++];
		  }

		  if(i>mid){
		    for(l=j; l<=right; l++)
		    	num2[k++] = n[l];
		  }
		  else{
		    for(l=i; l<=mid; l++)
		    	num2[k++] = n[l];
		  }

		  for(l=left; l<=right; l++){
		    n[l] = num2[l];
		  }
	}
	public static void merge_sort(int left, int right) {
		int mid;
		if(right>left) {
			mid = (left+right)/2;
			merge_sort(left,mid);
			merge_sort(mid+1,right);
			merge(left,mid,right);
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder ret = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		n = new int[num][2];
		for(int i=0; i<num;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			n[i][0] = Integer.parseInt(str2[0]);
			n[i][1] = Integer.parseInt(str2[1]);
		}
		num2 = new int[n.length][2];
		merge_sort(0,num-1);
		for(int i=0;i<num;i++) {
			ret.append(n[i][0]+" "+n[i][1]);
			ret.append("\n");
		}
		bw.write(ret.toString());
		bw.flush();
	}
}
