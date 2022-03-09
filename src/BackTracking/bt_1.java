package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_1 {

	public static int[]arr;
	public static boolean[] v;
	public static StringBuilder s = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		v=new boolean[m];
		arr=new int[n];
		bt(m,n,0);
		System.out.println(s);
		
	}
	public static void bt(int m, int n, int d) {
		if(d==n) {
			for(int val:arr) {
				s.append(val).append(' ');
			}
			s.append('\n');
			return;
		}
		
		for(int i=0; i<m; i++) {
			if(!v[i]) {
				v[i]=true;
				arr[d]=i+1;
				bt(m,n,d+1);
				v[i]=false;
			}
		}
	}

}
