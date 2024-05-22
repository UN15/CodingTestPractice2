import java.io.*;
import java.util.Arrays;
public class p2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		sb.append((sum/5)+"\n");
		sb.append(arr[2]);
		System.out.println(sb);
	}

}
