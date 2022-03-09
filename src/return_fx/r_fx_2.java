package return_fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r_fx_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		System.out.println(fi(n));
	}
	public static int fi(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fi(n-1)+ fi(n-2);
	}

}
