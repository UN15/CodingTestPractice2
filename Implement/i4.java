// import java.io.*;
// import java.util.StringTokenizer;
// public class i4 {

// 	public static void main(String[] args) throws IOException {
// 		// TODO Auto-generated method stub
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		int n = Integer.parseInt(st.nextToken());
// 		int m = Integer.parseInt(st.nextToken());
// 		st = new StringTokenizer(br.readLine());
// 		int a = Integer.parseInt(st.nextToken());
// 		int b = Integer.parseInt(st.nextToken());
// 		int d = Integer.parseInt(st.nextToken());
// 		int[][] check = new int[n][m];
// 		int[][] arr = new int[n][m];
// 		for(int i = 0; i<n; i++) {
// 			st = new StringTokenizer(br.readLine());
// 			for(int j = 0; j<m; j++) {
// 				arr[i][j] = Integer.parseInt(st.nextToken());
// 				check[i][j] = 0;
// 			}
// 		}
// 		check[a][b] = 1;
                int dx, dy;
[1 0 0 1]
// 		d-=1;
// 		if(d<0){
// 			d = 3;
// 		}
// 		if(d == 0)

// 	}
// }

import java.io.*;
import java.util.StringTokenizer;
public class i4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		if(d-1<0)
			d = 3;
		
		arr[a][b]

	}
}

