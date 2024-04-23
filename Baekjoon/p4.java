import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m>=45)
			m-=45;
		else if(m<45) {
			m = m-45+60;
			h-=1;
			if(h<0)
				h = 24+h;
		}
		System.out.println(h+" "+m);
	}
}
