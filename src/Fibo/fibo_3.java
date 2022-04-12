package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo_3 {
	static int[] arr = new int[1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		
		for(int i=3; i<arr.length; i++) {
			arr[i]=-1;
		}
		System.out.println(fi(n));
	}
	public static int fi(int n) {
		if(arr[n]==-1) {
			arr[n]=(fi(n-1)+fi(n-2))%15746;
		}
		return arr[n];
	}

}
