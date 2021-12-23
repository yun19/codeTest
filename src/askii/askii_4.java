package askii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class askii_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(A.readLine());
		
        for(int i=0; i<n; i++){
            String[] str= A.readLine().split(" ");
            
            int k = Integer.parseInt(str[0]);
            String S = str[1];
            
            for(int j=0; j<S.length(); j++){
                for(int t=0; t<k; t++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
		
		
	}

}