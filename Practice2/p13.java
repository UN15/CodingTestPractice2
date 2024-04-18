import java.util.*;
public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solution(a, b));
		
	}
	public static int solution(int a, int b) {
		int answer = 0;
		String a1 = Integer.toString(a);
		String a2 = Integer.toString(b);
		//String first = String.valueOf(a)+String.valueOf(b);

		String first = a1+a2;
		String second = a2+a1;
		
		if(Integer.parseInt(first) < Integer.parseInt(second))
			answer = Integer.parseInt(second);
		else
			answer = Integer.parseInt(first);
		return answer;
	}
}
// toString() 은 null 값을 넣으면 NullPointerException 발생 & Object의 값이 String이 아니여도 출력
// String.valueOf() 는 파라미터로 null이 오면 null이라는 문자열 출력