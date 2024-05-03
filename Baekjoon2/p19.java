import java.util.*;
public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = "";
		String d = "";
		while(a!=0) {
			c+=a%10;
			a = a/10;
		}
		while(b!=0) {
			d+=b%10;
			b = b/10;
		}
		if(Integer.parseInt(c)>Integer.parseInt(d))
			System.out.println(c);
		else
			System.out.println(d);
		
	}

}
