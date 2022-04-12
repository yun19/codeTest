package Fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibo_12 {
	static int n;
	static int[]sep;
	static int[]arr_f;
	static int[]arr_b;
	

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(A.readLine());
		sep= new int[n];
		arr_f= new int[n];
		arr_b=new int[n];
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		for(int i=0; i<n; i++) {
			sep[i]=Integer.parseInt(st.nextToken());
		}
		fro();
		bac();
		int max =0;
		for(int i=0; i<n; i++) {
			if(max<arr_f[i]+arr_b[i]) {
				max = arr_f[i]+arr_b[i];
			}
		}
		System.out.println(max-1);
		
	}
	static void fro() {
		for(int i=0; i<n; i++) {
			arr_f[i] =1;
			for(int j=0; j<n; j++) {
				if(sep[j]<sep[i] && arr_f[i]<arr_f[j]+1) {
					arr_f[i]= arr_f[j]+1;
				}
			}
		}
	}
	
	static void bac() {
		for(int i=n-1; i>=0; i--) {
			arr_b[i]=1;
			for(int j=n-1; j>=0; j--) {
				if(sep[j]< sep[i] && arr_b[i]<arr_b[j]+1) {
					arr_b[i]=arr_b[j]+1;
				}
			}
		}
	}

}
