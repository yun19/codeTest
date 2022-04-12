package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibo_11 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(A.readLine());
		int[] cot = new int[n];
		int[] arr= new int[n];
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		for(int i=0; i<n; i++) {
			cot[i] =Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			arr[i]=1;
			for(int j=0; j<n; j++) {
				if(cot[i]>cot[j] && arr[j]+1>arr[i]) {
					arr[i]=arr[j]+1;
				}
			}
		}
		int max =-1;
		for(int i=0; i<n; i++) {
			max = arr[i]>max ? arr[i]:max;
		}
		System.out.println(max);
	}

}
