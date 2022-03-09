package askii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class askii_10 {
	
	static BufferedReader A = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		
		int count =0;
		int n=Integer.parseInt(A.readLine());
		for(int i=0; i<n; i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static boolean check() throws IOException{
		boolean[] check = new boolean[26];
		int prev =0;
		String str = A.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			if(prev != now) {
				if(check[now-'a']==false) {
					check[now-'a']=true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		return true;
	}

}
