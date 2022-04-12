package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class greedy_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		
		int n =Integer.parseInt(st.nextToken());
		int k =Integer.parseInt(st.nextToken());
		
		int[]arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(A.readLine());
		}
		
		int count = 0;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<=k) {
				count+= (k/arr[i]);
				k=k%arr[i];
			}
		}
		
		System.out.println(count);
	}

}
