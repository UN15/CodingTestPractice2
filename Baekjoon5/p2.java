//import java.util.*;
//public class p2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int count = 0;
//		int i;
//		for(i = 1; i<=n; i++) {
//			if(n%i == 0) {
//				count++;
//				if(count == k)
//					break;
//			}
//		}
//		if(count<k)
//			System.out.println(0);
//		else
//			System.out.println(i);
//	}
//
//}

import java.io.*;
import java.util.StringTokenizer;
public class p2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		int result = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				count++;
				if(count == k) {
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
		
	}

}