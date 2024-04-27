import java.util.*;
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int i, j, l;

		for(int k = 0; k<n; k++)
			arr[k] = k+1;
		
		for(int a = 0; a<m; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			l = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = l;
		}
		
		for(int e: arr)
			System.out.print(e+" ");
	}

}
