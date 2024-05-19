import java.io.*;
public class p11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			Integer.parseInt(s[0]);
			Integer.parseInt(s[1]);
		}
	}

}
