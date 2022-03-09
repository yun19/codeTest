package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class array_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader A= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(A.readLine());
		int []arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(A.readLine());
		}
		Arrays.sort(arr);
		
		for(int val :arr) {
			sb.append(val).append('\n');
		}
		System.out.println(sb);
	}

}
