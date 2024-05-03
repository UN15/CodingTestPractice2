import java.util.*;
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int sum = 0;
		for(int i = 0; i<n; i++)
			sum+=Character.getNumericValue(arr[i]);
		System.out.println(sum);
	}

}
