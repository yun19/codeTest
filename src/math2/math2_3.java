package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math2_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder b = new StringBuilder();
		
		int n = Integer.parseInt(A.readLine());
		
		for(int i=2; i<=n; i++) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;
			}
		}
	}

}
