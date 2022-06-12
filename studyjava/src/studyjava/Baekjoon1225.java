package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); //Str1 + Str2 ;
		StringBuilder sb = new StringBuilder();
		int result = 0;

		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < sb.length() - 1; j++) {
				sb.append(result);
			}
			System.out.println(sb);
		}
	}

	}

//	BufferedReader br = new BufferedReader(
//			new InputStreamReader(System.in));
//			N=Integer.parseInt(br.readLine());
//			W=new int[N][N];
//			same=new boolean[N];
//
//	for(
//	int i = 0;i<N;i++)
//	{
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for (int j = 0; j < N; j++) {
//			W[i][j] = Integer.parseInt(st.nextToken());
//		}
//
//	}for(
//	int i = 0;i<N;i++)
//	{
//		same[i] = true;
//		Scheduling(i, 0);
//		same[i] = false;
//	}System.out.println(min);
//}
//
//private static void Scheduling(int start,int level, int sum) {
//if(level == N-1) {
//	if(W[now][start]!=0){
//		min=Math.min(min, sum+W[now][start]);
//	}
//	return;
//}
//else if(sum>=min) { //백트레킹 조건
//	return;
//}
//for(int i=0;i<N;i++) {
//	if(same[i]||
//	}
//}
//}
