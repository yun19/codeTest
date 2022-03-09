package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_3 {
	public static int[]arr;
	public static int n,m;
	public static StringBuilder sb= new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(A.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr=new int[m];
		def(0);
		System.out.println(sb);

	}

	public static void def(int d) {
		if(d==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=1; i<=n; i++) {
			arr[d]=i;
			def(d+1);
		}
	}
}
