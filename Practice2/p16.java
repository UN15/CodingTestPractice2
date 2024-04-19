import java.util.*;
public class p16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		
		boolean[] included = {true, false, false, true, true};
		
		System.out.println(solution(a, d, included));
	}
	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int n = included.length;
		for(int i = 0; i<n; i++) {
			if(included[i]) 
				answer+= a+i*d;
		}
		return answer;
	}
}
