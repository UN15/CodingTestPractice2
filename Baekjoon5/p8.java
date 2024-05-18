import java.io.*;
import java.util.StringTokenizer;
public class p8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sarr = br.readLine().split(" ");
		int min = -1;
		for(String s: sarr) {
			min = Math.min(min, Integer.parseInt(s));
		}
		System.out.println(min);
	}

}
