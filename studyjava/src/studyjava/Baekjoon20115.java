package studyjava;

import java.util.Scanner;

/*
1. 임의의 서로 다른 두 에너지 드링크를 고른다.
2. 한쪽 에너지 드링크를 다른 쪽 에너지 드링크에 모두 붓는다. 단, 페인은 야근 후유증으로 인해 손이 떨려, 붓는 과정에서 원래 양의 절반을 바닥에 흘리게 된다.
3. 다 붓고 남은 빈 에너지 드링크는 버린다.
4. 1~3 과정을 에너지 드링크가 하나만 남을 때까지 반복한다.

합쳐진 에너지 드링크의 양을 최대로!
*/
public class Baekjoon20115 {
	//total = 음료수 총 합, amount = 에너지 드링크 양
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max= 0;
		double total = 0;
		
		for(int i=0; i<arr.length;i++) {
			int amount = sc.nextInt();
			if (amount>max) {
				max = amount;
			}
			arr[i] = amount; //음료수 양 배열에 입력하기
		}
		for(int i = 0; i<arr.length;i++) {
			if(max != arr[i]) {
				total += (double) arr[i]/2;
			}
		}
		total += max;
		System.out.println(total);
	}

}
