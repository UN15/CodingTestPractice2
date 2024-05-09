import java.util.*;
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[][] a = new char[5][5];
		for(int i = 0; i<5; i++) {
			String str = sc.next();
			for(int j = 0; j<5; j++)
				a[i][j] = str.charAt(j);
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(a[j][i]);
			}	
		}
				
	}

}
