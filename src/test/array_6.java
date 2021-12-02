package test;

import java.util.Scanner;

public class array_6 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int n = A.nextInt();
		String[]str= new String[n+1];
		for(int i=0; i<n; i++) {
			str[i] = A.next();
			int sum =0, cnt=0;
			for(int j =0; j<str[i].length(); j++) {
				if(str[i].charAt(j)== 'O') {
					cnt++;
					sum+=cnt;
				}
				else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}

}
