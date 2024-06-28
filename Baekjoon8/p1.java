import java.io.*;
import java.util.StringTokenizer;
public class p1 {
//1934
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = 1;
			int i1 = 2;
			while(true) {
				if(b<i1) 
					break;
				else {
					if(a%i1 == 0 && b % i1 == 0) {
						result*=i1;
						a = a/i1;
						b = b/i1;
					}
					else {
						i1++;
					}
				}
			}
			result = result*a*b;
			sb.append(result+"\n");
		}
		
		System.out.println(sb);
		
	}

}
