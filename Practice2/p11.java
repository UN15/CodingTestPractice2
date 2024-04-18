import java.util.*;
public class p11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(solution(str1, str2));
	}
	
	public static String solution(String str1, String str2) {
		String answer = "";
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		for(int i = 0; i<c1.length; i++) {
			answer += c1[i];
			answer += c2[i];
		}
		return answer;
	}

}
