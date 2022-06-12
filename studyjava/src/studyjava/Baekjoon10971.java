package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*1번부터 N번까지 번호가 매겨져 있는 도시들이 있고, 도시들 사이에는 길이 있다.
  어느 한 도시에서 출발해 N개의 도시를 모두 거쳐 다시 원래의 도시로 돌아오는 여행 경로 계획.
  조건 1) 한 번 갔던 도시로는 갈 수 없다.
  조건 2) 가장 적은 비용을 들이는 여행 계획
  조건 3) 경우에 따라 도시 i에서 도시 j로 갈 수 없는 경우도 있으며 이럴 경우 W[i][j]=0
 */
public class Baekjoon10971 {
	
	static int N, W[][], min =Integer.MAX_VALUE; //hashCode 값이 음수면 양수로 바꾸기 위해 Integer.MAX_VALUE 처리를 한다.
	static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		visited= new boolean[N];
		
		for(int i=0; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				W[i][j]=Integer.parseInt(st.nextToken());
			}
	
		}
		for(int i=0;i<N;i++){
			visited[i]=true;
			Scheduling(i,i,0,0); // 틀렸던 부분 Scheduling(0,0,0,0)>Scheduling(i,0,0,0)>Scheduling(i,i,0,0)
			visited[i]=false;
		}
		System.out.println(min);
	}

	private static void Scheduling(int start, int now, int level, int sum) {
		if(level == N-1) {
			if(W[now][start]!=0){// 시작점으로 돌아오는 경로가 있을 경우
				min=Math.min(min, sum+W[now][start]);
			}
			return;
		}
		else if(sum>=min) { //백트레킹 조건
			return;
		}
		for(int i=0;i<N;i++) {
			if(visited[i]||W[now][i]==0) //경로가 없거나 방문 했던 경우
				continue;
			else {
				visited[i]=true;
				Scheduling(start, i, level+1, sum+W[now][i]);
				visited[i]=false;
			}
		}
	}

}
