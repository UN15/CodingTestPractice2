import java.io.*;
import java.util.StringTokenizer;
public class p3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		int a = a1*a2;
		int b = b1*b2;
		int i = 2;
		while(true) {
			if(i>a && i>b)
				break;
			else {
				if(a%i == 0 && b % i == 0) {
					a /=i;
					b/=i;
				}
				else {
					i++;
				}
			}
		}
		sb.append(a+" "+b);
		System.out.println(sb);
	}

}
