package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(A.readLine());
		
		int count=1, sum=0;
		while(true) {
			if(x <= count+sum) {
				if(count %2 ==1) {
					System.out.println((count-(x-sum-1)) + "/"+ (x-sum));
				break;
				}
				else {
					System.out.println((x-sum)+"/"+ (count-(x-sum-1)));
					break;
				}
			}
			else {
				count+=sum;
				count++;
			}
		}
	}

}
