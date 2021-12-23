package askii;

import java.util.Scanner;

public class askii_7 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		int n= A.nextInt();
		int m= A.nextInt();
		A.close();
		
		n=Integer.parseInt(new StringBuilder().append(n).reverse().toString());
		m=Integer.parseInt(new StringBuilder().append(m).reverse().toString());
		
		System.out.print(n>m ? n:m);

	}

}
