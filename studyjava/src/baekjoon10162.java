import java.util.Scanner;

public class baekjoon10162 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, A, B, C;
        T = sc.nextInt();
        
        if(T%10 != 0){
            System.out.println("-1");
        }
        else{
            A = T/300;
            T = T%300;
            B = T/60;
            T = T%60;
            C = T/10;
            
            System.out.println(A + " " + B + " " + C);
        }
    }
}
