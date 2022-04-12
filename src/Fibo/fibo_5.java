package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibo_5 {
	
	final static int red =0;
	final static int green =1;
	final static int blue=2;

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n= Integer.parseInt(A.readLine());
		int[][] sum = new int[n][3];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(A.readLine()," ");
			sum[i][red]=Integer.parseInt(st.nextToken());
			sum[i][green]=Integer.parseInt(st.nextToken());
			sum[i][blue]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<n; i++) {
			sum[i][red]+=Math.min(sum[i-1][green], sum[i-1][blue]);
			sum[i][green]+=Math.min(sum[i-1][red], sum[i-1][blue]);
			sum[i][blue]+=Math.min(sum[i-1][green], sum[i-1][red]);
		}
		
		System.out.println(Math.min(Math.min(sum[n-1][red], sum[n-1][green]), sum[n-1][blue]));
		
	}

}
