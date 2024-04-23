import java.util.*;
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c)
			sum=10000+a*1000;
		else if(a!=b && b!=c && a!=c) {
			int max = a;
			if(max < b)
				max = b;
			if (max < c)
				max = c;	
			sum = max*100;
		}
		else {
			if(a == b)
				sum = 1000+a*100;
			else if(b == c)
				sum = 1000+b*100;
			else if(a == c)
				sum = 1000+a*100;
		}
		System.out.println(sum);
	}

}
