package black;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class black_4 {
	public static boolean [][] arr;
	public static int min=64;

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		arr = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str = A.readLine();
			for(int j=0; j<m; j++) {
				if(str.charAt(j)=='W') {
					arr[i][j]=true;
				}
				else {
					arr[i][j]=false;
				}
			}
		}
		int n_r = n-7;
		int m_c = m-7;
		
		for(int i=0; i<n_r; i++) {
			for(int j=0; j<m_c; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
				
	}
	public static void find(int x, int y) {
		int ex =x+8;
		int ey= y+8;
		int count =0;
		
		boolean TF = arr[x][y];
		
		for(int i=x; i<ex; i++) {
			for(int j=y; j<ey; j++) {
				if(arr[i][j] != TF) {
					count++;
				}
				TF = (!TF);
			}
			TF = !TF;
		}
		count = Math.min(count, 64-count);
		
		min = Math.min(min, count);
	}

}
