import java.util.*;
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int r = sc.nextInt();
			char[] s = sc.next().toCharArray();
			for(int k = 0; k<s.length; k++)
				for(int j = 0; j<r; j++)
					System.out.print(s[k]);
			System.out.println();
		}
	}

}
