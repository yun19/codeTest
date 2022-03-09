package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_9 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer s = new StringTokenizer(A.readLine()," ");
			int x=Integer.parseInt(s.nextToken());
			int y=Integer.parseInt(s.nextToken());
			int z=Integer.parseInt(s.nextToken());
			if(x==0 && y==0 && z==0 )break;
			if((x*x+y*y)==z*z ) {
				System.out.println("right");
			}
			else if((z*z+y*y)==x*x ) {
				System.out.println("right");
			}
			else if((x*x+z*z)==y*y ) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}

}
