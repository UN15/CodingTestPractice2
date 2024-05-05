import java.util.*;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		int l;
		int k = n;
		for(i = n-1; i>=0; i--) {
			for(j = 0; j<i; j++)
				System.out.print(" ");
			for(l = k-i; l>0; l--)
				System.out.print("*");
			System.out.println();
			k++;
		}
		k-=2;
		for(i = 1; i<n; i++) {
			for(j = 0; j<i; j++)
				System.out.print(" ");
			for(l = i; l<k; l++)
				System.out.print("*");
			System.out.println();
			k--;
		}
		
		
	}
}

