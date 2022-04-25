package studyjava;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList <>();

        for (int i = 1 ; i <= N ; i++){
            queue.add(i);
        }
        System.out.println(card(queue));
    }

    public static Integer card(Queue<Integer> queue){

        while (queue.size()>1){

            queue.poll(); //ť���� ����

            int tmp = queue.poll();
            queue.add(tmp); ////�ڷ� �ֱ�

        }
        return queue.poll();
    }
}