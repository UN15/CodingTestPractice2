import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<n.length(); i++) {
			int a = (int)n.charAt(i);
			if(a>=65)
				a-=55;
			sum+=a*Math.pow(b, i);
		}
		System.out.println(sum);
	}

}
