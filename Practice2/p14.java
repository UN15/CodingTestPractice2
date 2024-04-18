import java.util.*;
public class p14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solution(a, b));
		
	}
	public static int solution(int a, int b) {
		int answer = 0;
		String s = String.valueOf(a)+String.valueOf(b);
		int m = 2*a*b;
		if(Integer.valueOf(s)>= m)
			answer = Integer.valueOf(s);
		else
			answer = m;
		
		return answer;
	}

}
