import java.util.*;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int i, j, k;
		for(int a = 0; a<m; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int b = i-1; b<j; b++)
				arr[b] = k;
		}
		for(int e: arr)
			System.out.print(e+" ");
	}

}
