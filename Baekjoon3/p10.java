import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[101][101];
		int count = 0;
		
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int k = a; k<10+a; k++) {
				for(int m = b; m<10+b; m++) {
					if(arr[k][m] == 0)
						arr[k][m] = 1;
				}
			}
		}
		for(int x = 0; x<101; x++) {
			for(int y = 0; y<101; y++) {
				if(arr[x][y] == 1)
					count++;
			}
		}
		
		System.out.println(count);
		
	}

}
