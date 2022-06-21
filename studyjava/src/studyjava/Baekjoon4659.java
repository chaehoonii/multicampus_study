package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
 3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
 4. 마지막 테스트 케이스는 end
 5. 패스워드는 한글자 이상 20글자 이하의 문자열, 대문자 X
 */
public class Baekjoon4659 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String pwd = br.readLine();
			if(pwd.equals("end")) 
				break;
			sb.append("<").append(pwd).append("> is ");
			if(!acceptable(pwd)) {
				sb.append("not ");
			}
			sb.append("acceptable.").append("\n");
		}
		System.out.println(sb.toString());
	}
	static boolean acceptable(String s) {
		char[] aArr = s.toCharArray();
		ArrayList<Character> aList = new ArrayList<Character>(20);
		for(int i=0;i<aArr.length;i++) {
			aList.add(aArr[i]);
		}
		if(!firstCondition(aList))
			return false;
		
		for(int i=2;i<aArr.length;i++) {
			if(secondCondition(aArr[i])&&secondCondition(aArr[i-1])&&secondCondition(aArr[i-2])) {
				return false;
			}else if(!secondCondition(aArr[i])&&!secondCondition(aArr[i-1])&&!secondCondition(aArr[i-2])) {
				return false;
			}
		}
		for(int i=1;i<aArr.length;i++) {
			if(aArr[i]==aArr[i-1]) {
				if(aArr[i]!='e'&&aArr[i]!='o') {
					return false;
				}
			}
		}
		return true;
	}
	static boolean firstCondition(ArrayList<Character> aList) {
		return(aList.contains('a')||aList.contains('e')||aList.contains('i')||aList.contains('o')||aList.contains('u'));
	}
	static boolean secondCondition(Character c) {
		return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

}
