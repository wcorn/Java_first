import java.io.*;
import java.util.*;
public class test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		String str = br.readLine();
		int num = Integer.parseInt(br.readLine());
		sb.append(str.length()+3+"\n"+num+3);
		bw.write(sb.toString());
		bw.flush();
	}

}
