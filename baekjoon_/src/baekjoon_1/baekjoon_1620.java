package baekjoon_1;
import java.io.*;
public class baekjoon_1620 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String[][] dic;
	static String[][] dic_sort;
	static String[][] temp;
	static void merge(int left,int mid, int right) {
		int i, j, k, l;
		  i = left;
		  j = mid+1;
		  k = left;
		  while(i<=mid && j<=right){
			    if(dic_sort[i][0].compareTo(dic_sort[j][0])<=0)
			    	temp[k++] = dic_sort[i++];
			    else
			    	temp[k++] = dic_sort[j++];
			  }

			  if(i>mid){
			    for(l=j; l<=right; l++)
			    	temp[k++] = dic_sort[l];
			  }
			  else{
			    for(l=i; l<=mid; l++)
			    	temp[k++] = dic_sort[l];
			  }

			  for(l=left; l<=right; l++){
				  dic_sort[l] = temp[l];
			  }
	}
	static void merge_sort(int left,int right) {
		int mid;
		if(left<right){
		    mid = (left+right)/2;
		    merge_sort(left, mid);
		    merge_sort(mid+1, right);
		    merge(left, mid, right);
		  }
	}
	static String binarySearch(String ent,int right) {
		int left =0;
		while(left<right) {
			int mid = (left+right)/2;
			if(ent.equals(dic_sort[mid][0])) {
				return dic_sort[mid][1];
			}
			if(ent.compareTo(dic_sort[mid][0])>0) {
				left=mid+1;
			}
			else if(ent.compareTo(dic_sort[mid][0])<=0){
				right=mid-1;
			}
		}
		return dic_sort[left][1];
	}
	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int n1 = Integer.parseInt(str2[0]);
		int n2 = Integer.parseInt(str2[1]);
		dic = new String[n1][2];
		dic_sort = new String[n1][2];
		temp = new String[n1][2];
		for(int i=0;i<n1;i++) {
			dic[i][0] = br.readLine();
			dic[i][1] = Integer.toString(i+1);
			dic_sort[i] = dic[i];
		}
		merge_sort(0,n1-1);
		for(int i=0;i<n2;i++) {
			String ent = br.readLine();
			if(ent.charAt(0)>=49&&ent.charAt(0)<=57) {
					sb.append(dic[Integer.parseInt(ent)-1][0]+"\n");
			}
			else {
				sb.append(binarySearch(ent,n1-1)+"\n");
			}
		}
		bw.append(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
