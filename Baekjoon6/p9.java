import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class p9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		
		for(int i = 0; i<n; i++) {
			str[i] = br.readLine();
		}
//		Arrays.sort(str, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				if(s1.length() == s2.length())
//					return s1.compareTo(s2);
//				else
//					return s1.length()- s2.length();
//			}
//		});
		
		Arrays.sort(str, (s1, s2)->{
			return s1.length() != s2.length() ? s1.length()- s2.length() : s1.compareTo(s2);
		});
		
		sb.append(str[0]+"\n");
		for(int i = 1; i<n; i++) {
			if(!str[i].equals(str[i-1])) {
				sb.append(str[i]+"\n");
			}
		}
		System.out.println(sb);
	}

}
