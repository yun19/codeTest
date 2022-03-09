package black;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class black_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(A.readLine());
		
		int [][]arr= new int[n][2];
		String [] str;
		for(int i=0; i<n; i++) {
			str=A.readLine().split(" ");
			arr[i][0]= Integer.parseInt(str[0]);
			arr[i][1]= Integer.parseInt(str[1]);			
		}
		StringBuilder s = new StringBuilder();
		for(int i=0; i<n; i++) {
			int number=1;
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					number++;
				}
			}
			s.append(number).append(' ');
		}
		System.out.println(s);
	}

}
