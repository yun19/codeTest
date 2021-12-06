package test.array;

import java.util.Scanner;

public class array_3 {

	public static void main(String[] args) {

		Scanner A =new Scanner(System.in);
		int num= A.nextInt()*A.nextInt()*A.nextInt();
		
		int arr[]= new int[10];
		while(num>0) {
			arr[num%10]++;
			num = num/10;
		}
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
