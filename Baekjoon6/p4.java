import java.io.*;
import java.util.Arrays;
public class p4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i = 0; i<n; i++)
			sb.append(arr[i]+"\n");
		System.out.print(sb);
	}

}
