package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		int [] arr= new int[8001];
		
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int mid=10000;
		int mos=10000;
		
		for(int i=0; i<n; i++) {
			int val = Integer.parseInt(A.readLine());
			sum+=val;
			arr[val+4000]++;
			if(max<val) {
				max=val;
			}
			if(min>val) {
				min=val;
			}
		}
		
		int count=0;
		int mos_max=0;
		
		boolean x =false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			if(arr[i]>0) {
				if(count < (n+1)/2) {
					count+=arr[i];
					mid = i-4000;
				}
				if(mos_max <arr[i]) {
					mos_max = arr[i];
					mos = i-4000;
					x=true;
				}
				else if(mos_max==arr[i] && x==true) {
					mos=i-4000;
					x=false;
				}
			}
		}
		System.out.println((int)Math.round((double)sum/n));
		System.out.println(mid);
		System.out.println(mos);
		System.out.println(max-min);
	}

}
