package test.array;

import java.util.Scanner;

public class array_4 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int arr[]= new int[10];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]= A.nextInt() %42;
			
		}
		for(int i=0; i<arr.length; i++ ) {
			int cnt=0;
			for(int j=i+1; j<arr.length; j++) {
			 if(arr[i]==arr[j]) {
					cnt++;
				} 
		 }
		 if(cnt==0) {
			 count++;
		 }
		}
		System.out.println(count);
	}

}
