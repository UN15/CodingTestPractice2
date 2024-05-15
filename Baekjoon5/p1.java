import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class p1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		while(a[0] != "0" && a[1] != "0") {
			int n = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			
			if(m%n == 0) 
				System.out.println("factor");
			else if(n%m == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");

			 a = br.readLine().split(" ");

		}
	}

}
