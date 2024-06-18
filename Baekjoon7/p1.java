import java.io.*;
import java.util.StringTokenizer;
public class p1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
	}

}
