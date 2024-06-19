import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;
public class p3 {
//7785
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashMap<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if(b.equals("enter")) {
				hmap.put(a, 1);
			}
			else {
				hmap.put(a, 0);
			}
		}
		Collections.sort(keySet);
		for(Entry<String, Integer> entrySet: hmap.entrySet()) {
			if(entrySet.getValue() != 0) {
				sb.append(entrySet.getKey()+"\n");
			}
		}
		
		System.out.println(sb);
	}

}
