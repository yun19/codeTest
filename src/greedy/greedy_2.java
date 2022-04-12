package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class greedy_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(A.readLine());
		
		int[][]arr = new int[n][2];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(A.readLine()," ");
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			public int compare(int[]o, int[]t) {
				if(o[1]==t[1]) {
					return o[0]-t[0];
				}
				return o[1]-t[1];
			}
		});
		
		int count =0;
		int time =0;
		
		for(int i=0; i<n; i++) {
			if(time<=arr[i][0]) {
				time= arr[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
