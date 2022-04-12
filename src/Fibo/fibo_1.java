package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo_1 {
	static Integer[][] arr= new Integer[41][2];
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(A.readLine());
		
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			int n = Integer.parseInt(A.readLine());
			fi(n);
			sb.append(arr[n][0]+" "+arr[n][1]).append('\n');
		}
		System.out.println(sb);
	}
	static Integer[] fi(int n) {
		if(arr[n][0]==null||arr[n][1]==null) {
			arr[n][0]=fi(n-1)[0] +fi(n-2)[0];
			arr[n][1]=fi(n-1)[1] +fi(n-2)[1];
		}
		return arr[n];
	}
}
