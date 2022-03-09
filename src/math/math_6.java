package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_6 {
	public static int [][] apt = new int[15][15];
	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		make_APT();
		
		int t= Integer.parseInt(A.readLine());
		
		for(int i=0; i<t ; i++) {
			int k = Integer.parseInt(A.readLine());
			int n = Integer.parseInt(A.readLine());
			sb.append(apt[k][n]).append('\n');
		}
		System.out.println(sb);
		
	}
	public static void make_APT() {
		for(int i=0; i<15; i++) {
			apt[i][1]=1;
			apt[0][i]=i;
		}
		for(int i=1; i<15; i++) {
			for(int k=2; k<15; k++) {
				apt[i][k]= apt[i-1][k] + apt[i][k-1];
			}
		}
	}

}
