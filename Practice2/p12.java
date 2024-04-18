import java.util.*;
public class p12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = {"a", "b", "c"};
		System.out.println(solution(arr));
	}
	public static String solution(String[] arr) {
		String answer = "";
		for(String s: arr) {
			answer+=s;
		}
		return answer;
	}

}
