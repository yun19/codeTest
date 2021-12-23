package askii;

import java.util.Scanner;

public class askii_3 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int[]arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		String S = A.nextLine();
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if(arr[ch-'a']==-1) {
				arr[ch-'a']=i;
			}
		}
		for(int val : arr) {	//배열 출력
			System.out.print(val + " ");
		}
		
	}

}
// 입력받은 알파벳 (bae) => 1 0 -1 -1 2