package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class array_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(A.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i<n; i++) {
			list.add(Integer.parseInt(A.readLine()));
		}
		
		Collections.sort(list);
		for(int val:list) {
			sb.append(val).append("\n");
		}
		System.out.println(sb);
	}

}
