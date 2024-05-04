import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr2= {1, 1, 2, 2, 2, 8} ;
		for(int i = 0; i<6; i++) {
			int a = sc.nextInt();
			System.out.print((arr2[i] - a) + " ");
		}
	}

}
