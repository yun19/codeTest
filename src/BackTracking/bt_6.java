package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_6 {
	public static int[][]arr=new int [9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(A.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		fin(0,0);
	}
	public static void fin(int row, int col) {
		if(col==9) {
			fin(row+1,0);
			return;
		}
		if(row==9) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		if(arr[row][col]==0) {
			for(int i=1; i<=9; i++) {
				if(pos(row, col, i)) {
					arr[row][col]=i;
					fin(row,col+1);
				}
			}
			arr[row][col]=0;
			return;
		}
		fin(row,col+1);
		
	}
	public static boolean pos(int row, int col, int value) {
		for(int i=0; i<9; i++) {
			if(arr[row][i]==value) {
				return false;
			}
		}
		
		for(int i=0; i<9; i++) {
			if(arr[i][col]==value) {
				return false;
			}
		}
		
		int set_row = (row/3)*3;
		int set_col = (col/3)*3;
		
		for(int i=set_row; i<set_row+3; i++) {
			for(int j=set_col; j<set_col+3; j++) {
				if(arr[i][j]==value) {
					return false;
				}
			}
		}
		return true;
	}
}
