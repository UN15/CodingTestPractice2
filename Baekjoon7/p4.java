import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
public class p4 {
	//1620 // 시간 초과 발생
	public static boolean checkDigit(String str) {
		boolean flag = true;
		
		for(int i = 0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static<K, V> K getKey(Map<K, V> map, V value) {
		for(K key: map.keySet()) {
			if(value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hmap = new HashMap<>();
		HashMap<Integer, String> hmap2 = new HashMap<>();

		for(int i = 1; i<=n; i++) {
			String str = br.readLine();
			hmap.put(str, i);
			hmap2.put(i, str);
		}
		
		for(int i = 0; i<m; i++) {
			String b = br.readLine();
			boolean check = checkDigit(b);
			if(check) {
				sb.append(hmap2.get(Integer.parseInt(b))+"\n");
			}
			else {
				sb.append(hmap.get(b)+"\n");
			}
				
		}
		System.out.println(sb);
	}
	
}
