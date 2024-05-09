import java.util.*;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[9][9];
		int max = -1;
		int max_i = 0, max_j = 0;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]>max) {
					max = a[i][j];
					max_i = i+1;
					max_j = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(max_i+" "+max_j);
	}

}
