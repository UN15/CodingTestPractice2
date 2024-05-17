//import java.util.*;
//public class p1 {
// 1. Scanner && System.out.println() 이용 방법
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		while(n != 0 && m != 0) {
//			if(m % n == 0)
//				System.out.println("factor");
//			else if(n%m == 0)
//				System.out.println("multiple");
//			else
//				System.out.println("neither");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//
//		
//	}
//}

import java.io.*;
import java.util.StringTokenizer;
public class p1 {
//2.BufferedReader && StringBuilder 이용 방법
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if(n == 0 && m == 0)
				break;
			if(m % n == 0)
				sb.append("factor\n");
			else if(n%m == 0)
				sb.append("multiple\n");			
			else
				sb.append("neither\n");

		}
		System.out.println(sb);
		
	}
}
