//import java.util.*;
//public class p5 {
//	public static boolean isPrime(int n) {
//		boolean result = true;
//		if(n == 1) {
//			result = false;
//		}
//		for(int i = 2; i<=Math.sqrt(n); i++) {
//			if(n%i == 0) {
//				result = false;
//				break;
//			}
//		}
//		return result;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		int sum = 0;
//		int min = -1;
//		for(int i = m; i<=n; i++) {
//			if(isPrime(i)) {
//				if(sum == 0) {
//					min = i;
//				}
//				sum+=i;
//			}		
//		}
//		if(sum != 0) 
//			System.out.println(sum);
//		System.out.println(min);
//
//	}
//}

import java.io.*;
public class p5 {
	public static boolean isPrime(int n) {
		boolean result = true;
		if(n == 1) {
			result = false;
		}
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		int min = -1;
		
		for(int i = m; i<=n; i++) {
			if(isPrime(i)) {
				if(sum == 0) {
					min = i;
				}
				sum+=i;
			}		
		}
		if(sum != 0) 
			sb.append(sum+"\n");
		sb.append(min);
		System.out.println(sb);

	}
}
