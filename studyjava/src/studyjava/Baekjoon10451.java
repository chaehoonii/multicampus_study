package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//point=꼭지점, line=연결선
public class Baekjoon10451 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int re = Integer.parseInt(st.nextToken());
		while(re-- > 0) {
			st = new StringTokenizer(br.readLine());
			int point = Integer.parseInt(st.nextToken());
			int line = point;
			boolean[] visited = new boolean[point + 1];
			LinkedList<Integer>[] list = new LinkedList[point + 1];
			for(int i = 0; i < list.length; i++) {
				list[i] = new LinkedList<Integer>();
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= line; i++) {
				int v1 = i;
				int v2 = Integer.parseInt(st.nextToken());
				
				list[v1].add(v2);
				list[v2].add(v1);
			}
			
			int count = 0;
			for(int i = 1; i < list.length; i++) {
				if(!visited[i]) {
					count++;
					dfs(i, list, visited);
				}
			}
			System.out.println(count);
			
		}
	}
	public static void dfs(int point, LinkedList<Integer>[] list, boolean[] visited) {
		visited[point] = true;

		for(int e : list[point]) {
			if(!visited[e]) {
				dfs(e, list, visited);				
			}
		}
	}
}