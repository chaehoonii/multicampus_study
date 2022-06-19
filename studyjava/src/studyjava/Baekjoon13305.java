package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int city = Integer.valueOf(br.readLine());
		long[] distance = new long[city-1];
		long[] price = new long[city];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<city-1; i++) {
			long length = Integer.valueOf(st.nextToken());
			distance[i] = length;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<city;i++){
			long fuel = Integer.valueOf(st.nextToken());
			price[i] = fuel;
		}
		
		int now = 0;
		int next = now + 1;
		long total = distance[0]*price[0];
		
		while(next<city-1) {
			if(price[now]<price[next]) {
				total += distance[next]*price[now];
			}
			else {
				total += distance[next]*price[next];
				now = next;
			}
			next++;
		}
		System.out.println(total);
		
	}

}
