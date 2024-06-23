import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
public class p5 {
//10816
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, Integer> hmap = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i<n; i++) {
			String str = st.nextToken();
			if(hmap.containsKey(str)){
				hmap.put(str, hmap.get(str)+1);
			}
			else {
				hmap.put(str, 1);
			}
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<m; i++) {
			String c = st.nextToken();
			if(hmap.containsKey(c)) {
				sb.append(hmap.get(c)+" ");
			}
			else
				sb.append(0+" ");
		}
		
		System.out.println(sb);
	}

}
