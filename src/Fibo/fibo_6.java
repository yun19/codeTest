package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibo_6 {
	static int[][]arr;
	static Integer[][]dp;
	static int n;
	
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(A.readLine());
		
		arr= new int[n][n];
		dp= new Integer[n][n];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(A.readLine()," ");
			for(int j=0; j<i+1; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<n; i++) {
			dp[n-1][i]=arr[n-1][i];
		}
		System.out.println(find(0,0));
	}
	
	static int find(int h, int index) {
		if(h==n-1) return dp[h][index];
		
		if(dp[h][index]==null) {
			dp[h][index]=Math.max(find(h+1,index), find(h+1,index+1))+arr[h][index];
		}
		return dp[h][index];
	}
}
