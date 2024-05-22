import java.io.*;
public class p13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<=n/3; i++) {
			for(int j = 0; j<=n/5; j++) {
				int sum = 3*i+5*j;
		
				if(sum == n)
					min = Math.min(min, i+j);
			}
		}
		if(min != Integer.MAX_VALUE) {
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
}
