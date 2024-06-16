import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class p11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] index = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			index[i] = arr[i];
		}
		
		Arrays.sort(index);
		
		for(int i = 0; i<n; i++) {
			int findIndex = Arrays.binarySearch(index, arr[i]);
			sb.append(findIndex+" ");
		}
		
		System.out.println(sb);
	 }

}
