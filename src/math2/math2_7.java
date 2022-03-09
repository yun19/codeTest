package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_7 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s= new StringTokenizer(A.readLine()," ");
		
		int x=Integer.parseInt(s.nextToken());
		int y=Integer.parseInt(s.nextToken());
		int w=Integer.parseInt(s.nextToken());
		int h=Integer.parseInt(s.nextToken());
		
		int x_min = Math.min(x, w-x);
		int y_min = Math.min(y, h-y);
		
		System.out.println(Math.min(x_min, y_min));
	}

}
