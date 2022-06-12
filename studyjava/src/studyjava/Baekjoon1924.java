package studyjava;

import java.util.Scanner;

//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
public class Baekjoon1924 {

		static int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31}; // 각 월별 일자 저장
		
		public static void main(String[] args)   {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum=0;
			
			for(int i=1;i<x;i++) { // 입력 받은 월의 이전 월까지 총 일수를 구한다.
				sum+=month[i];
			}
			sum+=y; // 입력 받은 일자를 더해준다.
			
			switch(sum % 7) { //7로 나눈 후 나머지 값을 통해 날짜 분류
				case 0:
					System.out.println("SUN");
					break;
				case 1:
					System.out.println("MON");
					break;
				case 2:
					System.out.println("TUE");
					break;
				case 3:
					System.out.println("WED");
					break;
				case 4:
					System.out.println("THU");
					break;
				case 5:
					System.out.println("FRI");
					break;
				case 6:
					System.out.println("SAT");
					break;
			}
			
			
		}

	}


