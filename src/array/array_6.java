package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class array_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(A.readLine());
		
		int[][]arr= new int[n][2];
		
		StringTokenizer s;
		for(int i=0; i<n; i++) {
			s = new StringTokenizer(A.readLine());
			arr[i][0] = Integer.parseInt(s.nextToken());
			arr[i][1] = Integer.parseInt(s.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2)-> {
			if(e1[0]==e2[0]) {
				return e1[1]-e2[1];
			}
			else {
				return e1[0]-e2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
