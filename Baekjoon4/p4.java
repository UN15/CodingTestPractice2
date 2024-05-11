import java.io.*;
public class p4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		n = (int)(Math.pow(2, n));
		System.out.println((int)Math.pow(n+1, 2));
	}

}
