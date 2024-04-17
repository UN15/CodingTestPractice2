import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String overwrite_string = sc.nextLine();
		int s = sc.nextInt();
		System.out.println(solution(my_string, overwrite_string, s));
	}
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		int l = overwrite_string.length();
		answer += my_string.substring(0, s);
		answer += overwrite_string;
		if(answer.length()< my_string.length()) {
			answer+= my_string.substring(s+l);
		}
		return answer;
	}
}
