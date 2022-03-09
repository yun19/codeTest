package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class math2_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		A.readLine();
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		int count =0;
		while(st.hasMoreElements()) {
			boolean isprime = true;
			int num = Integer.parseInt(st.nextToken());
			if(num==1) {
				continue;
			}
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i ==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				count++;
			}
		}
		System.out.print(count);
	}

}
