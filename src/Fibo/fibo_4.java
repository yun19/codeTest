package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibo_4 {
	public static Long[] arr = new Long[101];

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		arr[0]=0L;
		arr[1]=1L;
		arr[2]=1L;
		arr[2]=1L;
		
		int n = Integer.parseInt(A.readLine());
		while(n-->0) {
			sb.append(fi(Integer.parseInt(A.readLine()))).append('\n');
		}
		System.out.println(sb);
	}
	public static long fi(int n) {
		if(arr[n]==null) {
			arr[n]=fi(n-2)+fi(n-3);
		}
		
		return arr[n];
	}

}
