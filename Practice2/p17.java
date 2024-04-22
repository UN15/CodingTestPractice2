import java.util.*;
public class p17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(solution(a,b,c));
	
	}
	public static int solution(int a, int b, int c) {
		int answer = 0;
		if(a == b && b == c) {
			answer += ((a+b+c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2))*(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)));
		}
		else if(a!=b && b!=c && a != c) {
			answer += (a+b+c);
		}
		else
			answer += ((a+b+c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)));
		return answer;
	}
}
