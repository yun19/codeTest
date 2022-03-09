package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bt_5 {
	public static int[]arr;
	public static int n;
	public static int count=0;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(A.readLine());
		arr= new int[n];
		Queen(0);
		System.out.println(count);

	}
	public static void Queen(int d) {
		if(d==n) {
			count++;
			return;
		}
		for(int i=0; i<n; i++) {
			arr[d]=i;
			if(Pos(d)) { //i번째 행에 놓을 수 있는지를 검사하는 함수
				Queen(d+1);
			}
		}
	}
	public static boolean Pos(int col) {
		for(int i=0; i<col; i++) {
			if(arr[col]==arr[i]) {
				return false;
			}
			
			else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])) {
				return false;
			}
		}
		return true;
	}

}
