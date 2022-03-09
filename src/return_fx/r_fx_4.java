package return_fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class r_fx_4 {
	public static StringBuilder st = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
		st.append( (int)(Math.pow(2, n)-1)).append('\n');
		hanoi(n, 1, 2, 3);
		System.out.println(st);
	}
	public static void hanoi(int n, int left, int mid, int fin) {
		// 이동할 원반의 수가 1개라면?  
	
		if(n==1) {
			st.append(left+" "+ fin+ "\n");
			return;
		}
		// STEP 1 : N-1개를 A에서 B로 이동
		hanoi(n-1,left,fin,mid);
		// STEP 2 : 1개를 A에서 C로 이동
		st.append(left+" "+fin+"\n");
		// STEP 3 : N-1개를 B에서 C로 이동
		hanoi(n-1, mid, left, fin);
	}
}
		
