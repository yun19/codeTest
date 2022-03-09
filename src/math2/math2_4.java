package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_4 {
	public static boolean[] prime;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(A.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		prime= new boolean[n+1];
		get_prime();
		
		StringBuilder b= new StringBuilder();
		
		for(int i=m; i<=n; i++) {
			if(!prime[i])b.append(i).append('\n');
		}
		System.out.println(b);
	}
	public static void get_prime() {
		prime[0]=prime[1]=true;
		
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i])continue;
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j]=true;
			}
		}
	}
}
