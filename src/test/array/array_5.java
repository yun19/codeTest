package test.array;

import java.util.Scanner;

public class array_5 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int n = A.nextInt();
		int score[]= new int[n];
		int max=0;
		int sum=0;
		int m=0;
		double avg=0.0;
		for(int i=0; i<n; i++) {
			score[i] = A.nextInt();
			if(score[i]>max) {
					max= score[i];
			}
			sum+=score[i];
		}
		A.close();
		avg= 100.0*sum /max/n;
		System.out.println(avg);

	}

}
