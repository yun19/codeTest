package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class fibo_13 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		int[] arr =new int[n];
		int[][] dp = new int[n][2];
		StringTokenizer st;
		
		for(int i=0; i<dp.length; i++) {
			st =new StringTokenizer(A.readLine()," ");
				dp[i][0]=Integer.parseInt(st.nextToken());
				dp[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(dp, new Comparator<int[]>() {
			public int compare(int[]o, int[]t) {
				return o[0]-t[0];
			}
		});
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=1;
			for(int j=0; j<i; j++) {
				if(dp[i][1]>dp[j][1]) {
					arr[i]=Math.max(arr[i],arr[j]+1);
				}
			}
		}
		int max=0;
		for(int i=0; i<n; i++) {
			max=Math.max(max,arr[i]);
		}
		System.out.println(n-max);
	}

}
