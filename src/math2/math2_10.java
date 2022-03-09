package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math2_10 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(A.readLine());
		
		System.out.println(r*r*Math.PI);
		System.out.println(r*r*2);
		
	}

}
