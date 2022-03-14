import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon1417 {

	static int go(int d, int[] arr, int count) {
		Arrays.sort(arr);

		int last = arr.length - 1;
		if (d > arr[last]) {
			return count;
		}

		arr[last]--;
		return go(d + 1, arr, count + 1);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());

		int[] arr = new int[n - 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (n == 1) {
			System.out.println(0);
			return;
		}

		System.out.println(go(d, arr, 0));

	}

}