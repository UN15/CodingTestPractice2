import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class D2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] arr = new char[n][m];
		
		for(int i = 0; i<n; i++) {
			String str = br.readLine();
			for(int j = 0; j<m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		check(arr, 0, 0);

	}
	
	static void check(char[][] arr, int x, int y){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x);
		q.add(y);
		deque
	}
}
