import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
public class p6 {
//1764
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String str;
		String check;
		HashMap <String, Integer> hmap = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			str = br.readLine();
			hmap.put(str, 1);
		}

		for(int i = 0; i<m; i++) {
			check = br.readLine();
			if(hmap.containsKey(check)) {
				arr.add(check);
			}
		}
		
		Collections.sort(arr);
		int count = 0;
		for(String s: arr) {
			count++;
			sb.append(s+"\n");
		}
		
		System.out.println(count);
		System.out.println(sb);
	}

}
