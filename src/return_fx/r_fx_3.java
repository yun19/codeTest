package return_fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r_fx_3 {
	static char[][]arr;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		arr= new char[n][n];
		
		star(0,0,n,false);
		
		StringBuilder st = new StringBuilder();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				st.append(arr[i][j]);
			}
			st.append('\n');
		}
		System.out.print(st);
		
	}
	static void star(int x, int y, int n, boolean k) {
		
		if(k) {
			for(int i=x; i<x+n; i++) {
				for(int j=y; j<y+n; j++) {
					arr[i][j]=' ';
				}
			}
			return;
		}
		
		if(n==1) {
			arr[x][y]='*';
			return;
		}
		
		int size=n/3;
		int count =0;
		
		for(int i=x; i<x+n; i+=size) {
			for(int j=y; j< y+n; j+=size) {
				count++;
				if(count == 5) {
					star(i,j,size,true);
				}
				else {
					star(i,j, size,false);
				}
			}
		}
	}

}
