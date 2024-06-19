import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class p1 {
//10815
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> hmap = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<n; i++) {
			hmap.put(st.nextToken(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
//		for(int i = 0; i<m; i++) {
//			String a = st.nextToken();
//			if(hmap.containsKey(a)) {
//				sb.append(1+" ");
//			}
//			else {
//				sb.append(0+" ");
//		
//			}
//		}
//		
//		System.out.println(sb);
		for(int i = 0; i<m; i++) {
			String a = st.nextToken();
			if(hmap.get(a) != null) {
				sb.append(1+" ");
			}
			else {
				sb.append(0+" ");
		
			}
		}
		
		System.out.println(sb);
	}

}
