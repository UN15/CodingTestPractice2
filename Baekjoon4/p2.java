import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		String s = "";
		while(n >= b) {
			int a = n % b;
			n = n/b;
			if(a>=10) {
				a+=55;
				s+=(char)a;
			}
			else
				s+=a;
		}
		if(n>=10) {
			n+=55;
			s+=(char)n;
		}
		else
			s+=n;
		
		for(int i = s.length()-1; i>=0; i--)
			System.out.print(s.charAt(i));
	
	}

}
