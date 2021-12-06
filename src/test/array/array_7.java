package test.array;

import java.util.Scanner;

public class array_7 {

	public static void main(String[] args) {
		Scanner A= new Scanner(System.in);
		int n = A.nextInt();
		for(int i=0; i<n; i++) {
			int ca = A.nextInt(); //학생 수
			int sum=0, cnt=0;
			double avg=0, avag=0; //평균 점수, 비율
			int arr[]= new int[ca]; //점수를 저장할 배열
			for(int j=0; j<ca; j++) {
				arr[j]= A.nextInt();
				sum += arr[j];
			}
				avg = sum/ca;
				for(int k=0; k<arr.length; k++) {
					if(arr[k]>avg) {
						cnt++;
					}
				}
				
			
			avag= (double)cnt/ca *100 ; //cnt를 double로 변경 후 백분율 계산
			System.out.printf("%.3f",avag);
			System.out.println("%");
			
		}
		A.close();
	}

}
