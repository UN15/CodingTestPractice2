import java.io.*;
import java.util.StringTokenizer;
public class g3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int sum = 0;
		while(true) {
			if(n%k == 0) {
				sum++;
				n = n/k;
			}
			else {
				sum++;
				n-=1;
			}
			if(n == 1)
				break;
		}
		
		System.out.println(sum);
	}

}
