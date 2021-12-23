package askii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class askii_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(A.readLine(), " ");
		System.out.print(st.countTokens());
	}

}
