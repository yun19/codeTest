package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_7 {
	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	public static int[] op = new int[4];
	public static int[] number;
	public static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(A.readLine());
		number = new int[n];
		
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		for(int i=0; i<n; i++) {
			number[i]= Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(A.readLine()," ");
		for(int i=0; i<4; i++) {
			op[i]=Integer.parseInt(st.nextToken());
		}
		
		bt(number[0],1);
		System.out.println(MAX);
		System.out.println(MIN);

	}
	public static void bt(int num, int id) {
		if(id==n) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(op[i]>0) {
				op[i]--;
				
				switch(i){
				case 0: bt(num+number[id], id+1); break;
				case 1: bt(num-number[id], id+1); break;
				case 2: bt(num*number[id], id+1); break;
				case 3: bt(num/number[id], id+1); break;
				}
				op[i]++;
			}
		}
	}
}
