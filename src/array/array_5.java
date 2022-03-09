package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class array_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		char [] arr=A.readLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length -1; i>=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
