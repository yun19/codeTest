package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_4 {
	public static int[]arr;
	public static int n,m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(A.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr= new int[m];
		def(1,0);
		System.out.println(sb);
	}
	public static void def(int a, int d) {
		if(d==m) {
			for(int val:arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=a; i<=n; i++) {
			arr[d]=i;
			def(i,d+1);
		}
	}

}
