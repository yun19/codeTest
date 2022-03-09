package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math2_2 {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(A.readLine());
		int y = Integer.parseInt(A.readLine());
		
		prime = new boolean[y+1];
		get_prime();
		
		int sum=0;
		int min = Integer.MAX_VALUE;
		for(int i=x; i<=y; i++) {
			if(prime[i]==false) {
				sum+=i;
				if(min==Integer.MAX_VALUE) {
					min=i;
				}
			}
		}
		
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		

	}
	public static void get_prime() {
		prime[0]= true;
		prime[1]= true;
		
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j< prime.length; j+=i) {
				prime[j]=true;
			}
		}
	}

}
