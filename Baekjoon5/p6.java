//import java.io.*;
//public class p6 {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int i = 2;
//		StringBuilder sb = new StringBuilder();
//		while(n != 1) {
//			if(n%i == 0) {
//				sb.append(i+"\n");
//				n = n/i;
//			}
//			else
//				i++;
//		}
//		System.out.println(sb);
//	}
//
//}

import java.io.*;
public class p6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i<=Math.sqrt(n); i++) {
			while(n % i == 0) {
				sb.append(i+"\n");
				n = n/i;
			}
		}
		if(n != 1){
			sb.append(n);
		}
		System.out.println(sb);
	}

}
