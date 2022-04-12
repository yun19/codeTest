package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo_14 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str1= A.readLine().toCharArray();
		char[] str2=A.readLine().toCharArray();
		
		int length_1=str1.length;
		int length_2=str2.length;
		
		int [][]arr = new int[length_1+1][length_2+1];
		
		for(int i=1; i<=length_1; i++) {
			for(int j=1; j<=length_2; j++) {
				if(str1[i-1]==str2[j-1]) {
					arr[i][j]=arr[i-1][j-1]+1;
				}
				else {
					arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		System.out.println(arr[length_1][length_2]);
	}

}
