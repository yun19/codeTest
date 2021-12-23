package askii;

import java.util.Scanner;

public class askii_2 {

	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		int n= A.nextInt();
		String a = A.next();
		A.close();
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=a.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
