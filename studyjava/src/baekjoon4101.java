import java.util.Scanner;

public class baekjoon4101 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            
	            if (a == 0 && b == 0) break;
	            
	            String s = a > b ? "Yes" : "No";
	            System.out.println(s);
	        }
	        
	        sc.close();
	    }
	}
