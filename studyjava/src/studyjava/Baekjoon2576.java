package studyjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[7];
        for(int i=0; i<7; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<7; i++) {
            if(number[i] % 2 != 0) {
                sum += number[i];
                pq.add(number[i]);
            }
        }

        if(pq.size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(pq.poll());
    }
}