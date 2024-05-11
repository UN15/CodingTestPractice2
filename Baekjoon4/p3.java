import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class p3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			int cost = Integer.parseInt(br.readLine());
			
			System.out.print(cost/25+" ");
			cost = cost%25;

			System.out.print(cost/10+" ");
			cost = cost%10;

			System.out.print(cost/5+" ");
			cost = cost%5;

			System.out.println(cost/1);
			
		}
		
	}

}
