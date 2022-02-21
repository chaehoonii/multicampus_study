import java.util.Scanner;

public class baekjoon2442 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        for (int i = 1; i <= num; i++) {
	            for (int a = 0; a < num - i; a++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < (2 * i) - 1; j++) {
	 
	                System.out.print("*");
	            }
	 
	            System.out.println();
	        }
	 
	    }
	 
	}

