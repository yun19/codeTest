package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_11 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(A.readLine());
		
		while(t-->0){
			StringTokenizer s = new StringTokenizer(A.readLine()," ");
			
			int x1 = Integer.parseInt(s.nextToken());
			int y1 = Integer.parseInt(s.nextToken());
			int r1 = Integer.parseInt(s.nextToken());
			
			int x2 = Integer.parseInt(s.nextToken());
			int y2 = Integer.parseInt(s.nextToken());
			int r2 = Integer.parseInt(s.nextToken());
			
			System.out.println(get_distance( x1, y1, r1,x2, y2, r2));
		}

	}
	public static int get_distance(int x1, int y1, int r1, int x2, int y2, int r2) {
		int d = (int)(Math.pow(x2-x1,2) +Math.pow(y2-y1,2));
		
		if(x1==x2 && y1==y2&& r1==r2) {
			return -1;
		}
		else if(d>Math.pow(r1+r2, 2)) {
			return 0;
		}
		else if(d < Math.pow(r2-r1, 2)) {
			return 0;
		}
		else if(d==Math.pow(r2-r1, 2)) {
			return 1;
		}
		else if(d==Math.pow(r1+r2, 2)) {
			return 1;
		}
		else {
			return 2;
		}
	}

}
