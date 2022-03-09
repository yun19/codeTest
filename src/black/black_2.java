package black;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class black_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		int result=0;
		for(int i=0; i<n; i++) {
			int x=i;
			int sum=0;
			while(x!=0) {
				sum+=x%10;
				x/=10;
			}
			if(sum+i==n) {
				result=i;
				break;
			}
		}
		System.out.println(result);
	}

}
