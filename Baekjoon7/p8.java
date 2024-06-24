import java.io.*;
import java.util.HashMap;
public class p8 {
//11478
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		HashMap <String, Integer> hmap = new HashMap<>();
		while(true) {
			for(int i = 1; i<s.length(); i++) {
				for(int j = 0; j<=i; j++) {
					s.substring(j, i);
				}
				hmap.put(,1);
			}
		}
	}

}
