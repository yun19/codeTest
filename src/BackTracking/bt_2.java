package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_2 {
	public static int[] arr;
	public static int n,m;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dep(1,0);
		System.out.println(sb);
	}
	public static void dep(int s, int d) {
	
		if(d==m) {
			for(int val:arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=s; i<=n; i++) {
			arr[d]=i;
			dep(i+1,d+1);
		}
	}

}
