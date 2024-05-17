//import java.util.*;
//public class p4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int r = 0;
//
//		for(int i = 0; i<n; i++) {
//			int a = sc.nextInt();
//			int count = 0;
//			if(a == 1)
//				continue;
//			for(int j = 2; j<a; j++) {
//				if(a % j == 0)
//					count++;
//			}
//			if(count == 0)
//				r++;			
//		}
//		System.out.println(r);
//	}
//
//}
import java.io.*;
import java.util.StringTokenizer;
public class p4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			boolean isPrime = true;
			
			if(a == 1)
				continue;
			
			for(int j = 2; j<a; j++) {
				if(a % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
				r++;			
		}
		
		System.out.println(r);	
			
	}

}
