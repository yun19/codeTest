package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo_9 {
	
	final static long m = 1000000000;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(A.readLine());
		
		long[][]dp =new long[n+1][10];
		
		for(int i=1; i<10; i++) {
			dp[1][i]=1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][0] = dp[i-1][1] % m;
				}
				else if(j==9) {
					dp[i][9]=dp[i-1][8]%m;
				}
				else {
					dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%m;
				}
			}
		}
		
		long result =0;
		
		for(int i=0; i<10; i++) {
			result+=dp[n][i];
		}
		System.out.println(result % m);
		
	}

}
