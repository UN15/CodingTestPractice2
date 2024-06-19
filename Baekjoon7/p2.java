import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
public class p2 {
	//14425

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i<n; i++) {
			hmap.put(br.readLine(), 0);
		}
		for(int i = 0; i<m; i++) {
			if(hmap.containsKey(br.readLine())){
				count++;
			}
		}
		sb.append(count);
		System.out.println(sb);
	}

}
