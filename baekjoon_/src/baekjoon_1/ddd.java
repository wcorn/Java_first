package baekjoon_1;

import java.io.*;

public class ddd {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = new BufferedOutputStream ( System.out );
		 int num = Integer.parseInt(br.readLine());
		 out.write((num+ "\n").getBytes());
		 
	}

}
