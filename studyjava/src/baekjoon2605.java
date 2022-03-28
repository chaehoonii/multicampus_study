import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2605 {
    static void swap(int[] arr, int start, int end) {
        for(int i = 0; i < start; i++) {
            int tmp = arr[end];
            arr[end] = arr[--end];
            arr[end] = tmp;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int pos = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            swap(arr, Integer.parseInt(st.nextToken()), i);
        }
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}