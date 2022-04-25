/*Build Up : 1. 성의 첫 글자가 같은 선수 5명을 선발
			 2. 성의 첫 글자가 같은 선수가 5명보다 적다면, 기권(PREDAJA 출력하기)
			 3. 내일 경기를 위해 뽑을 수 있는 성의 첫 글자를 모두 구하기
			 
  Using method : 1. BufferReader - 자바의 정석 2편 p904~
  				 2. Arrays.Sort - 배열 오름차순 정렬 - Arrays.sort() 와 Collections.sort() (https://laugh4mile.tistory.com/175)
  				 3. 시간복잡도 개념 - https://mimimimamimimo.tistory.com/2
*/

package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon1159 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = new char[N]; //char형 배열
		String result = "";
		
		//배열 초기화
		for(int i = 0; i < N; i++) {
			arr[i] = (br.readLine()).charAt(0);
		}
		
		//오름차순 정렬
				Arrays.sort(arr);
				
				for(int i = 0; i < (N - 1); i++) {
					int count = 0;
					for(int j = (i + 1); j < N; j++) {
						//배열의 값이 같으면 count에 +1(0이 아닌 경우)
						if(arr[i] == arr[j] && arr[i] != '0') {
							count++;
							arr[j] = '0';
						}
					}
					
					//
					
				if(result.equals("")) {
					System.out.println("PREDAJA");
				}else {
						System.out.println(result);
					}
				}
	
	}
