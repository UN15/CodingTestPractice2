import java.io.*;
import java.util.*;
public class g2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] carr = new int[n];
		for(int i = 0; i<n; i++) {
			String[] arr = br.readLine().split(" ");
			Arrays.sort(arr);
			
			for(String e: arr) {
				System.out.print(e+" ");
			}
			carr[i] = Integer.parseInt(arr[0]);
		}
		Arrays.sort(carr);
		System.out.println(carr[n-1]);
	}

}
