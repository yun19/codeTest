package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(A.readLine());
		int count =1;
		int range=2;// 범위 (최솟값 기준) 
		
		if(n ==1) {
			System.out.println(1);
		}
		else {
			while(range <=n) {
				range = range + (count*6);
				count ++;
			}
			System.out.println(count);
		}
	}

}