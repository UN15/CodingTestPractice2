import java.util.*;
public class p3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int l = str.length();
		int check = 1;
		for(int i = 0; i<l/2; i++) {
			if(str.charAt(i) != str.charAt(l-1-i)) {
				check = 0;
				break;
			}
		}
		System.out.print(check);
				
	}

}
