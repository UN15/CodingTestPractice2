import java.io.*;
import java.util.StringTokenizer;
public class D1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int count = 0;
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j = 0; j<m; j++) {
				arr[i][j] = str.charAt(j)-'0';		
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				boolean c = check(arr, i, j, n, m);
				if(c) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	static boolean check(int[][] arr, int i, int j, int n, int m) {
		if(i<0 || j<0 || i>=n || j>=m)
			return false;
		if(arr[i][j] == 0) {
			arr[i][j] = 1;
			check(arr, i-1, j, n, m);
			check(arr, i, j-1, n, m);
			check(arr, i+1, j, n, m);
			check(arr, i, j+1, n, m);
			return true;
		}
		return false;
	}

}
