package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class math_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(R.readLine()," ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		A=A.add(B);
		System.out.print(A.toString());

	}

}