import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
public class p7 {
//1269
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		HashMap <String, Integer> hmap = new HashMap<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<String> arr = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<a; i++) {
			hmap.put(st.nextToken(), 1);
		}
		
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i<b; i++) {
			String check = st.nextToken();
			if(!hmap.containsKey(check)){
				arr.add(check);
			}
			else {
				hmap.remove(check);
			}
		}
		
		int count = hmap.size();
		for(String s: arr) {
			count++;
		}
	
		System.out.println(count);
	}

}
