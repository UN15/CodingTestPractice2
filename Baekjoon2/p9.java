import java.util.*;
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i, j;
		int[] arr = new int[n];
		for(int a = 0; a< n; a++)
			arr[a] = a+1;
		for(int a = 0; a<m; a++) {
			i = sc.nextInt()-1;
			j = sc.nextInt()-1;
			for(int b = i; b<=(i+j)/2; b++) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
				
				
		}
	}

}
