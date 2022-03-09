package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class array_10 {

	public static void main(String[] args) throws IOException {
		BufferedReader A = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(A.readLine());
		
		int []pre = new int[n];
		int []nex = new int[n];
		HashMap<Integer, Integer> rank_Map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(A.readLine()," ");
		
		for(int i=0; i<n; i++) {
			nex[i]= pre[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nex);
		
		int rank=0;
		for(int val:nex) {
			if(!rank_Map.containsKey(val)) {
				rank_Map.put(val, rank);
				rank++;
			}
		}
		StringBuilder s = new StringBuilder();
		for(int key:pre) {
			int fin = rank_Map.get(key);
			s.append(fin).append('\n');
		}
		System.out.print(s);
	}

}
