package black;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class black_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(A.readLine()," ");
		
		int n = Integer.parseInt(t.nextToken());
		int m = Integer.parseInt(t.nextToken());
		
		int [] arr = new int[n];
		t = new StringTokenizer(A.readLine()," ");
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(t.nextToken());
		}
		int result = search(arr,n,m);
		System.out.println(result);
		
	}
	static int search(int[] arr, int n, int m) {
		int result=0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+2; k<n; k++) {
					int temp = arr[i]+ arr[j]+ arr[k];
					if(temp==m) {
						return temp;
					}
					if(result<temp&& temp<m) {
						result=temp;
					}
				}
			}
		}
		return result;
	}

}
