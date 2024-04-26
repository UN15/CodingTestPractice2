import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, v;
		int count = 0;
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = sc.nextInt();
		v = sc.nextInt();
		for(int i = 0; i<n; i++)
			if(arr[i] == v)
				count++;
		System.out.println(count);
		
	}

}
