package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
양의 정수 N의 디지털 루트를 구하려면 N을 이루고 있는 모든 자리수를 더해야 한다. 
이때, 더한 값이 한 자리 숫자라면, 그 수가 N의 디지털 루트가 된다. 
두 자리 이상 숫자인 경우에는 다시 그 수를 이루고 있는 모든 자리수를 더해야 하며, 한 자리 숫자가 될 때 까지 반복한다.

사용 주요 개념 : charAt()
*/
public class Baekjoon6378 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//무한루프
		while(true) {
			String N = br.readLine();
			
			if(N.equals("0")) {
				//System.out.println("0"); //0입력 시 0출력
				break; //0 입력 시 종료
			}
			
			while(true) {
				int sum = 0;				
				//문자열 길이가 1이 되면 무한루프 종료
				if(N.length() <= 1) {
					break;
				}
				/*else {
				 for(int i=0;i<N.length();i++){
				 	
				}
				*/
				N = String.valueOf(sum);
			}
			System.out.println(N);
		}
	}
}


