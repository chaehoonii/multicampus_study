package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon14467 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] status = new int[11];
		
		Arrays.fill(status, 100);
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sts = Integer.parseInt(st.nextToken());
			
			if(status[num] == 100) status[num] = sts;
			else if(status[num] != sts) {
				status[num] = sts;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

