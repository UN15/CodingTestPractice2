import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class g1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		String[] arr = br.readLine().split(" ");
		Arrays.sort(arr, Collections.reverseOrder());
		int sum = 0;
		int count = 0;
		for(int i = 0; i<m; i++) {
			count++;
			if(count<=k) {
				sum+=Integer.parseInt(arr[0]);
			}
			else {
				sum+=Integer.parseInt(arr[1]);
				count = 0;
			}
		}
		
		System.out.println(sum);
	}

}
//arr[0]이 더해지는 횟수 => int(m/(k+1)) *k + m%(k+1)
//arr[1]이 더해지는 횟수 => m-arr[0] 횟수
