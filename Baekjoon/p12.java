import java.util.*;
public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, k;
		for(i = 1; i<=n; i++) {
			for(j = n; j>i; j--)
				System.out.print(" ");
			for(k = 0; k<i; k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
