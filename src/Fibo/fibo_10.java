package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class fibo_10 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(A.readLine());
		
		int[]arr= new int[n+1];
		int[] dp=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i]=Integer.parseInt(A.readLine());
		}
		
		dp[1]=arr[1];
		if(n>1) {
			dp[2]=arr[1]+arr[2];
		}
		for(int i=3; i<=n; i++) {
			dp[i]=Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		System.out.println(dp[n]);
	}

}
