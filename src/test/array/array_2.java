package test.array;

import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int arr[]= new int[9];
		
		for(int i=0; i<arr.length; i++ ) {
			arr[i]= A.nextInt();
		}
		int max= arr[0];
		int index =0;
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				index=i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
