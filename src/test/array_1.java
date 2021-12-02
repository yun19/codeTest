package test;

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		
		int num = A.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=A.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+ " " + arr[num-1]);
		
		
	}

}
