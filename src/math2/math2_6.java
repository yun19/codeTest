package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math2_6 {
	public static boolean prime[]=new boolean[10001];
	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder();
		int n = Integer.parseInt(A.readLine());
		get_prime();
		while(n-->0) {
			int t = Integer.parseInt(A.readLine());
			int x= t/2;
			int y= t/2;
			while(true) {
				if(!prime[x] && !prime[y]) {
					b.append(x).append(' ').append(y).append('\n');
					break;
				}
				x--;
				y++;
			}
		}
		System.out.println(b);
	}
	public static void get_prime() {
		prime[0]=prime[1]=true;
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i])continue;
			for(int j=i*i; j< prime.length; j+=i) {
				prime[j]=true;
			}
		}
	}
}
