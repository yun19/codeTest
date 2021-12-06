package fx;

import java.util.Scanner;

public class fx_1 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int n = A.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = A.nextInt();
		}
		System.out.println(sum(arr));
	}
	static long sum (int[] a) {
		long sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
