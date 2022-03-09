package return_fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r_fx_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		int sum= fac(n);
		System.out.println(sum);
		
	}
	public static int fac(int n) {
		if(n<=1) return 1;
		return n*fac(n-1);
	}

}
