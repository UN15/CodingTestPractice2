import java.util.*;
public class p2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++)
			a[i] = sc.nextInt();
		for(int i = 0; i<n; i++)
			if(x>a[i])
				System.out.print(a[i]+" ");
		
	}

}
