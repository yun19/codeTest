package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader A= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(A.readLine());
		
		int[] count = new int[10001];
		for(int i=0; i<n; i++) {
			count[Integer.parseInt(A.readLine())]++;
		}
		A.close();
		
		for(int i=1; i<10001; i++) {
			while(count[i]>0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}
		System.out.println(sb);

	}

}
