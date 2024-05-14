import java.util.*;
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		for(i = 1; i<=n; i++) {
			int sum = 0;
			char[] c = String.valueOf(i).toCharArray();
			for(int j = 0; j<c.length; j++) {
				sum+=Character.getNumericValue(c[j]);
			}
			sum+=i;
			
			if(sum == n) {
				System.out.println(i);
				break;
			}
			
		}
			if(i == n+1)
				System.out.println(0);

	}
	

}
