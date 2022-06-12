package studyjava;

/*
 조건 1)x와 y값이 모두 커야 덩치가 큰 것이다.
 조건 2)같은 덩치 등수를 가진 사람은 여러명도 가능하다.
 
### StringBuilder 사용법 및 사용 이유

String은 불변(immutable)객체이다.

예를 들어, String st1 = ”abc”; , String st2=”def”; 와 같이 2개의 String객체가 있을 때, 만약 “st1+st2”와 같은 연산을 하면 새로운 String을 생성한다.

즉, String객체와 String객체를 더하는 코드는 메모리 할당과 메모리 해제를 발생 시켜 더하는 연산이 많아진다면 성능적으로 좋지 않다.

StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용한다.

 StringBuilder에는 append()가 있는데, 이는 문자열을 더하는 역할을 한다.

만들어진 문자열을 출력하기 위해서는 StringBuilder의 인스턴스의 toString()을 부르면 된다. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken()); //x값
			arr[i][1]=Integer.parseInt(st.nextToken()); //y값
		}
		
		for(int i=0;i<N;i++) {
			int ranking = 1;
			for(int j=0;j<N;j++) {
				if(i==j)
					continue;
				//if(arr[i][0]>arr[j][0]&&arr[i][1]>arr[j][1])
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) //기준이 i->i가 j보다 덩치가 작을 경우 i의 등수 1증가.
					ranking++;
			}
			sb.append(ranking).append(" ");
		}
		System.out.println(sb);
	}
}
