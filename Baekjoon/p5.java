import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		b+=c;
		if(b>=60) {
			a+= b/60;
			b = b%60;
		}
		if(a>=24)
			a-=24;
		System.out.println(a+" "+b);
	}

}
