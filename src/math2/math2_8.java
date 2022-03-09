package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_8 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(A.readLine(), " ");
		
		int[] x= {Integer.parseInt(s.nextToken()), Integer.parseInt(s.nextToken())};
		s= new StringTokenizer(A.readLine()," ");
		int[] y= {Integer.parseInt(s.nextToken()), Integer.parseInt(s.nextToken())};
		s= new StringTokenizer(A.readLine(), " ");
		int[] z= {Integer.parseInt(s.nextToken()), Integer.parseInt(s.nextToken())};
		
		int a;
		int b;
		
		if(x[0]==y[0]) {
			a = z[0];
		}
		else if(x[0]==z[0]) {
			a = y[0];
		}
		else {
			a= x[0];
		}
		
		if(x[1]==y[1]) {
			b = z[1];
		}
		else if(x[1]==z[1]) {
			b = y[1];
		}
		else {
			b= x[1];
		}
		System.out.println(a+" "+b);
	}

}
