import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class p8 {
	//11651

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];

		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(str, new Comparator<Integer>() {
//			public int compare(Integer i1, Integer i2) {
//				

			
		Arrays.sort(arr, (num1, num2)->{
			return num1[1] != num2[1] ? num1[1]- num2[1]: num1[0]- num2[0];
		});
		
		for(int i = 0; i<n; i++) {
			sb.append(arr[i][0]+" "+ arr[i][1]+"\n");
		}
		
		System.out.println(sb);
		
	}

}
