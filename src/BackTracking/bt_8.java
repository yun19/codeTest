package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_8 {
	static int n;
	static int[][] arr;
	static boolean[] v ;
	
	static int Min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(A.readLine());
		
		arr = new int[n][n];
		v = new boolean[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(A.readLine()," ");
			for(int j=0; j<n; j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		fin(0,0);
		System.out.println(Min);
		
	}
	static void fin(int id, int count) {
		if(count == n/2) {
			dif();
			return;
		}
		
		for(int i= id; i<n; i++) {
			if(!v[i]) {
				v[i]=true;
				fin(id+1,count+1);
				v[i]=false;
			}
		}
	}
	
	static void dif() {
		int start =0;
		int link =0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(v[i]==true && v[j]==true) {
					start+=arr[i][j];
					start=+arr[j][i];
				}
				else if(v[i]==false && v[j]==false) {
					link+=arr[i][j];
					link+=arr[j][i];
				}
			}
		}
		int d = Math.abs(start-link);
		
		if(d==0) {
			System.out.println(d);
			System.exit(0);
		}
		Min = Math.min(d, Min);
	}

}
