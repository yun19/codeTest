package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo_8 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(A.readLine());
		
		System.out.println(num(n,0));
	}
	static int num(int n, int count) {
		if(n<2) {
			return count;
		}
		
		return Math.min(num(n/2,count+1+(n%2)),num(n/3,count+1+(n%3)));
	}
}
