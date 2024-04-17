import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(solution(str1, str2));
	}
	//str1이 부분 문자열인지 확인하는 문제
//	public static int solution(String str1, String str2) {
//		int answer = 0;
//		int l = str1.length();
//		for(int i = 0; i<=str2.length()-l; i++) {
//			if(str2.substring(i, i+l).equals(str1)) {
//				answer = 1;
//				break;
//			}
//		}
//		return answer;
//	}
	//target이 부분 문자열인지 확인하는 방법1
//	public static int solution(String my_string, String target) {
//		int answer = 0;
//		int l = target.length();
//		for(int i = 0; i<=my_string.length()-l; i++) {
//			if(my_string.substring(i, i+l).equals(target)) {
//				answer = 1;
//				break;
//			}
//		}
//		return answer;
//	}
	
	//target이 부분 문자열인지 확인하는 방법2
	public static int solution(String my_string, String target) {
		int answer = 0;
		if (my_string.contains(target))
			answer = 1;
		return answer;
	}
}
